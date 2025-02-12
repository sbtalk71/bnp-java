package com.demo.inheritance;

public class InstanceOfDemo {

	public static void main(String[] args) {
		
		Object name=new String("Ramesh");
		
		if(name instanceof String) {
		String newName=(String)name;
		System.out.println(newName);
		}

	}

}
