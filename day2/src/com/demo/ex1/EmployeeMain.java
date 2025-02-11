package com.demo.ex1;

import com.demo.has.a.ex2.Address;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee john=new Employee(100, "James", 20000);
		
		Employee james=new Employee(101, "John", 30000);
		
		Address addr= new Address();
		addr.setDoorNo("123");
		addr.setCity("Bangalore");
		
		Employee raju=new Employee(102, "Raju", 40000,addr);
		//raju.setAddress(addr);
		
		Employee temp;
		
		temp=john;
		john=james;
		james=temp;
		
		System.out.println(james.getDetails());
		System.out.println(john.getDetails());
		System.out.println(raju.getDetails());
		
		raju.setSalary(80000);
		System.out.println(raju.getDetails());
		
		System.out.println(raju.getAddress().getCity());
	}
}
