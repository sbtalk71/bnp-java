package com.demo.inheritance;

public class Employee extends Person{

	protected double salary;
	
	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary=salary;
		System.out.println("Employee Object created");
	}
	
	@Override
	public String getDetails() {
		
		return id+" "+name+" "+salary;
	}
	
	
	public void getInfo() {
		System.out.println("This is Employee Class");
	}
}
