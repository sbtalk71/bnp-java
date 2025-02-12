package com.demo.collections;

import java.util.Objects;

public class Emp {
	private int empId;
	private String name;
	private double salary;

	public Emp() {

	}

	public Emp(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return "("+empId+" "+name+" "+salary+")";
	}

	@Override
	public int hashCode() {
		System.out.println("inside hashcode");
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("inside equals...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return empId == other.empId;
	}
	
	
}
