package com.demo.collections;

import java.util.HashSet;

public class SortedSetDemo {

	public static void main(String[] args) {

		HashSet<String> fruits = new HashSet<String>();

		fruits.add("apple");
		//fruits.add(1000);
		fruits.add("guava");
		fruits.add("banana");
		fruits.add("orange");
		
		
		fruits.add("banana");
		
		System.out.println(fruits);
		
		fruits.remove("apple");
		
		
		/*
		 * Iterator<String> itr= fruits.iterator();
		 * 
		 * while(itr.hasNext()) { String fruit=itr.next(); System.out.println(fruit); }
		 */
		
	
	for(String s:fruits) {
		System.out.println(s);
	}

}}
