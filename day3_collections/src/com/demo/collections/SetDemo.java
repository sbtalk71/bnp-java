package com.demo.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		TreeSet<String> fruits = new TreeSet<String>();

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
