package com.revature;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.revature.models.Student;
import com.revature.utils.Deque;
import com.revature.utils.MathSorter;
import com.revature.utils.Queue;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Queue Demo");
		
		Queue<Integer> queue = new Queue<Integer>();
		queue.add(4);
		queue.add(8);
		queue.add(10);
		
		// You cannot use foreach loop statement with classes that doesn't implement Iterable interface
		// So in Java document if you see a data structure implement Iterable interface then you can use the foreach statement
		for (Integer i : queue) {	
			System.out.println(i);
		}
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println("Deque Demo");
		Deque<Integer> deque = new Deque<Integer>();
		deque.addFirst(5);
		deque.addFirst(10);
		deque.addFirst(17);
		
		deque.addLast(4);
		deque.addLast(3);
		deque.addLast(1);
		
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
		
		System.out.println("Iterating through");
		for (Integer i : deque) {
			System.out.println( i);
		}
		
		//the actual deque class used in Java
		ArrayDeque<Integer> javaDeque = new ArrayDeque<Integer>();
		javaDeque.addFirst(5);
		javaDeque.addFirst(10);
		javaDeque.addFirst(17);
		javaDeque.addLast(4);
		javaDeque.addLast(3);
		javaDeque.addLast(1);
		
		System.out.println("Iterating through arrayDeque");
		for (Integer integer : javaDeque) {
			System.out.println(integer);
		}
		
		System.out.println("Example of Comparable");
		
		Student s1 = new Student();
		s1.setHistoryGrade(100);
		s1.setMathGrade(67);
		s1.setSocialStudiesGrade(87);
		Student s2 = new Student();
		s2.setHistoryGrade(90);
		s2.setMathGrade(96);
		s2.setSocialStudiesGrade(76);
		Student s3 = new Student();
		s3.setHistoryGrade(96);
		s3.setMathGrade(100);
		s3.setSocialStudiesGrade(1);
		
		//Can be used simply to compare two objects
		System.out.println(s1.compareTo(s2));

		//A more advance use is using the compareTo method to sort 
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		System.out.println("Unsorted Queue");
		for (Student s : studentList) {
			System.out.println(s);
		}

		//By default, it will sort in ascending order
		Collections.sort(studentList);
		
		System.out.println("Sorted Queue - Asc order");
		
		for (Student s : studentList) {
			System.out.println(s);
		}
		
		Collections.sort(studentList, Collections.reverseOrder()); //This will do descending order

		System.out.println("Sorted Queue - Desc order");

		for (Student s : studentList) {
			System.out.println(s);
		}

		Collections.sort(studentList, new MathSorter());

		System.out.println("Sorted Queue - Asc order by Math");

		for (Student s : studentList) {
			System.out.println(s);
		}

		/**
		 * Now making a separate class just to use the sorting once will just clogged your application with a bunch of classes
		 * So in the event you just need to create a class just to use the sorting once, it is best to use Anonymous classes instead
		 * 
		 * Anonymous class
		 * Allows you to both declare and instantiate an object from the declared class
		 */
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student arg0, Student arg1) {
				return arg0.getSocialStudiesGrade() - arg1.getSocialStudiesGrade();
			}
		});

		System.out.println("Sorted Queue - Asc order by Social Studies");

		for (Student s : studentList) {
			System.out.println(s);
		}
	}

}
