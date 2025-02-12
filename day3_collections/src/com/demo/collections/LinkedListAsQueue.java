package com.demo.collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		Queue<String> fruitsQueue= new LinkedList<>();
		
		fruitsQueue.offer("apple");
		fruitsQueue.offer("orange");
		fruitsQueue.offer("guava");
		fruitsQueue.offer("banana");
		fruitsQueue.offer("mango");
		
		System.out.println(fruitsQueue);
		
		//-------//
		for(String fruit:fruitsQueue) {
			System.out.println(fruit);
		}
		
		System.out.println(fruitsQueue.peek());
		
		System.out.println("After Peek"+fruitsQueue);
		
		System.out.println(fruitsQueue.poll());
		System.out.println("After poll"+fruitsQueue);
		
		
		while(fruitsQueue.size()>=1) {
			System.out.println(fruitsQueue.poll());
			
		}

		System.out.println(fruitsQueue.size());
	}

}
