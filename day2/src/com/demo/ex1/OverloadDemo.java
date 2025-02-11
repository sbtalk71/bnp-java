package com.demo.ex1;

public class OverloadDemo {

	public void add() {
		System.out.println("invalid add() method..");
	}
	
	/*
	 * public int add(int a, int b) { System.out.println("add(int, int) called..");
	 * return a+b; }
	 */
	
	public float add(int a, int b, int c) {
		System.out.println("add(int, int, int) called..");
		return a+b+c;
	}
	
	public double add(double a, double b) {
		System.out.println("add(double, double) called..");
		return a+b;
	}
	
	
	public static void main(String[] args) {
		OverloadDemo od= new OverloadDemo();
		
		od.add();
		od.add(2,3);
		od.add(2,3,4);
		od.add(2.0,6.9);

	}

}
