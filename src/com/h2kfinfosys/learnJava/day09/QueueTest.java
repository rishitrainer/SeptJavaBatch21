package com.h2kfinfosys.learnJava.day09;

import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		PriorityQueue<String> empty = new PriorityQueue<String>();
		
		// 
		for(int i=1; i <= 10; i++) {
			queue.offer("Message " + i);
		}
		System.out.println(queue);
		System.out.println(queue.size());
		
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println("queue.element() " + queue.element());
		System.out.println(queue);
		System.out.println(empty.peek());
		System.out.println("empty.element() " + empty.element());
		// System.out.println(empty.remove()); // Exception
		System.out.println("queue.poll() " + queue.poll());
	
	}

}
