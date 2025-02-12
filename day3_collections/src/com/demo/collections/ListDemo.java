package com.demo.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<String>();

		fruits.add("apple");
		//fruits.add(1000);
		fruits.add("guava");
		fruits.add("banana");
		fruits.add("orange");
		
		fruits.add(2, "mango");
		fruits.add("banana");
		
		System.out.println(fruits);
		
		fruits.remove("apple");
		fruits.remove(3);
		
		System.out.println(fruits.get(2));
		
		/*
		 * Iterator<String> itr= fruits.iterator();
		 * 
		 * while(itr.hasNext()) { String fruit=itr.next(); System.out.println(fruit); }
		 */
		
	
	for(String s:fruits) {
		System.out.println(s);
	}

}}
