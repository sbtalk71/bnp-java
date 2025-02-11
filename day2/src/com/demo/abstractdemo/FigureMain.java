package com.demo.abstractdemo;

public class FigureMain {

	public static void main(String[] args) {
		Figure ref;
		
		Triangle t= new Triangle(20, 10);
		
		Rectangle r= new Rectangle(10,20);
		
		ref=t;
		System.out.println("Area of Triangle = "+ref.area());
		
		ref=r;
		
		System.out.println("Area of Rectangle = "+ref.area());

	}

}
