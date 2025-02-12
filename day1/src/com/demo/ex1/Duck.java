package com.demo.ex1;

public class Duck {
private String color;
private String breed;
private double size;
public static int duckCount;


public Duck(String color,String breed,double size) {
	this.color=color;
	this.breed=breed;
	this.size=size;
	duckCount++;
}


public String duckDetails() {
	return color+" "+breed+" "+size;
}

static {
	System.out.println("Static block executes..");
}

{
	System.out.println("Object Initializer executes..");
}


public static void mystaticMethod() {
	System.out.println("Static Method..");
}
}
