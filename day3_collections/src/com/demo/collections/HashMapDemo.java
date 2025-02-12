package com.demo.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> fruitsMap=new HashMap<>();
		fruitsMap.put(1, "apple");
		fruitsMap.put(2, "guava");
		fruitsMap.put(3, "orange");
		fruitsMap.put(4, "banana");
		fruitsMap.put(5, "mango");
		
		System.out.println(fruitsMap);
		
		fruitsMap.remove(2);
		
		
		Set<Integer> keys=fruitsMap.keySet();
		
		for(Integer key:keys) {
			System.out.println(key+" ---->  "+fruitsMap.get(key));
		}
		

	}

}
