package com.demo.collections;

import java.util.HashMap;
import java.util.Set;

public class EmpMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, Emp> empMap= new HashMap<>();
		empMap.put(100,new Emp(100, "ranga", 45000));
		empMap.put(101,new Emp(101, "vinod", 45000));
		empMap.put(102,new Emp(102, "chirag", 45000));
		empMap.put(103,new Emp(103, "ramol", 45000));
		empMap.put(104,new Emp(104, "karan", 45000));

		Set<Integer> keys=empMap.keySet();
		for(Integer key: keys) {
			System.out.println(empMap.get(key));
		}
	}

}
