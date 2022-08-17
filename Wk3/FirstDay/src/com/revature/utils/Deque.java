package com.revature.utils;

import java.util.Iterator;

public class Deque<T> implements Iterable<T>{
	private Node<T> first;
	private Node<T> last;
	
	public Deque(){
		this.first = null;
		this.last = null;
	}
	
	public void addFirst(T e) {
		Node newNode = new Node<T>(e);
		
		//initial setup, set both first and last be the newNode
		if (first == null && last == null) {
			first = newNode;
			last = newNode;
		}
		else {
			//Makes the first node point to the new Node
			first.next = newNode;
			
			//Makes the new node point to the previous Node
			newNode.previous = first;
			
			//Sets our first pointer to the new Node
			first = newNode;
		}
	}
	
	public T pollFirst() {
		if (first == null) return null;
		
		T data = first.data;
		
		//Grabs the previous Node and set the next pointer to null
		first.previous.next = null;
		
		//Sets first pointer to the previous Node
		first = first.previous;
		
		return data;
	}
	
	public void addLast(T e) {
		Node newNode = new Node<T>(e);
		
		if (first == null && last == null) {
			first = newNode;
			last = newNode;
		}
		else {
			last.previous = newNode;
			
			newNode.next = last;
			
			last = newNode;
		}
	}
	
	public T pollLast() {
		if (last == null) return null;
		
		T data = last.data;
		
		last.next.previous = null;
		
		last = last.next;
		
		return data;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new DequeIterator<T>(first);
	}
	
	private class DequeIterator<T> implements Iterator<T>{
		Node<T> first;
		
		public DequeIterator(Node<T> first) {
			this.first = first;
		}
		
		@Override
		public boolean hasNext() {
			return first != null;
		}

		@Override
		public T next() {
			T data = first.data;
			first = first.previous;
			
			return data;
		}
		
	}
	
	private class Node<T>{
		
		private Node<T> next;
		private Node<T> previous;
		private T data;
		
		public Node(T data) {
			this.next = null;
			this.previous = null;
			this.data = data;
		}
	}
	
}
