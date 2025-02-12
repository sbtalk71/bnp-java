package com.demo.collections;

import java.util.HashSet;

public class EmpSetDemo {

	public static void main(String[] args) {
		HashSet<Emp> empSet=new HashSet<>();
		
		empSet.add(new Emp(100, "ranga", 45000));
		empSet.add(new Emp(101, "vinod", 45000));
		empSet.add(new Emp(102, "chirag", 45000));
		empSet.add(new Emp(103, "ramol", 45000));
		empSet.add(new Emp(104, "karan", 45000));
		
		
		System.out.println(empSet);
	}

}
