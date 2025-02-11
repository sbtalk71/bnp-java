package com.demo.inheritance;

public class Trainee extends Employee {
	protected String performance;

	public Trainee(int id, String name, double salary, String performance) {
		super(id, name, salary);
		this.performance = performance;
	}
	
	@Override
	public String getDetails() {
		
		return super.getDetails()+" "+performance;
	}
}
