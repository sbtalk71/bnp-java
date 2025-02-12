package com.demo.anotations;

public class UseAnnotation {
	
	@Info(descriprion = "A sample Info", name="display")
	public void display() {
		System.out.println("annotated Method");
		
	}
}
