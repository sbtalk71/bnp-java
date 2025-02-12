package com.demo.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> fruitStack=new Stack<>();
		
		fruitStack.push("apple");
		fruitStack.push("guava");
		fruitStack.push("orangge");
		fruitStack.push("banana");
		fruitStack.push("mango");
		
		System.out.println(fruitStack);
		
		System.out.println(fruitStack.peek());
		
		while(fruitStack.size()>=1) {
			System.out.println(fruitStack.pop());
		}

	}

}
