package com.revature.utils;

import java.util.Iterator;

/*
 * Iterable interface is needed for data structure you want to iterate through using foreach
 * 
 * Essentially, it allows Java to be able to use this custom data structure we made in a foreach loop
 * Behind the scenes, a foreach loop will execute the iterator() method that we inherit from this interface
 */
public class Queue<T> implements Iterable<T>{
	private Node<T> last;
	
	public Queue() {
		last = null;
	}
	
	public Queue(T data){
		last = new Node<T>(data);
	}
	
	public boolean add(T e) {
		Node newNode = new Node(e);
		
		if(last == null) {
			//Make it point itself
			newNode.next = newNode;
			
			last = newNode;
		}
		else {
			//Makes the new node point to whatever the last node pointed at
			newNode.next = last.next;
			
			//Makes the last node point to the new node
			last.next = newNode;
			
			//Sets our last node to the newNode
			last = newNode;
		}
		
		
		return true;
	}
	
	public T poll() {
		//In case there is a possibility that the queue is empty, if so just return null
		if(last == null) return null;
		
		//We grab the data of the first node in queue
		T data = last.next.data;
		
		//Change the last node to point to the next node instead
		last.next = last.next.next;
		
		//Give the data from the first node in queue
		return data;
	}
	
	public T peek() {
		//In case there is a possiblity that the queue is empty, if so just return null
		if(last == null) return null;
		
		//Just give the data from the first node in queue
		return last.next.data;
	}

	//Take note that the iterator() method will need to return an Iterator
	//An Iterator is a class that is made to be able to iterate through this particular data structure
	//We would need to make one ourselves
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator<T>(last);
	}
	
	//We need to make a class that is specialize on iterating through whatever data structure it is attached to
	//It needs to implement Iterator interface and you have to implement hasNext() and next() method
	//These two methods is what your foreach loop will execute to iterate through your data structure
	private class QueueIterator<T> implements Iterator<T>{
		Node<T> last;
		Node<T> pointer;
		boolean loop; //Will ignores the first matching of the last and pointer node
		
		public QueueIterator(Node<T> last){
			this.last = last.next;
			this.pointer = last.next;
			this.loop = true;
		}

		//hasNext method will check if there is another element to iterate through
		@Override
		public boolean hasNext() {
			if (last == pointer && loop) {
				this.loop = false;
				
				return true;
			}
			
			return (last != pointer);
		}
		
		//next method will return the data and go to the next element
		@Override
		public T next() {
			// TODO Auto-generated method stub
			T data = pointer.data;
			pointer = pointer.next;
			
			return data;
		}
		
	}
	
	
	private class Node<T>{
			private Node<T> next;
			private T data;
			
			public Node() {
				this.next = null;
				this.data = null;
			}
			
			public Node(T data) {
				next = null;
				this.data = data;
			}
			
			public Node(T data, Node<T> next) {
				this.data = data;
				this.next = next;
			}
	}
}
