package com.demo.ex1;

import com.demo.has.a.ex2.Address;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private Address address; //has-a relationship
	
	
	public Employee(int empId,String empName,double salary) {
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		
	}
	
	public Employee(int empId,String empName,double salary,Address address) {
		this(empId, empName, salary);
		this.address=address;
		//System.out.println(address.getCity());
	}
	public String getDetails() {
		return empId+" "+empName+" "+salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public void setAddress(Address address) {
		this.address=address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	
}
