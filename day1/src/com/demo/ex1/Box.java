package com.demo.ex1;

public class Box {
	private int length;
	private int breadth;
	private int height;

	public Box(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

//create the 3 argument Constructor

//create a method for volume of the box which
// return a double valued result
//create a class BoxDemo with main method
// create a box object and print its volume to console

	public double volume() {
		return length*breadth*height;
	}
}
