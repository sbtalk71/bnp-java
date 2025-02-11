package com.demo.ex1;

public class DuckMain {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.demo.ex1.Duck");
		
		/*Duck d1= new Duck("white","indian",12);
		Duck d2= new Duck("greay","indian",15);
		Duck d3= new Duck("rainbow","mandarine",12);
		
		
		System.out.println(d3.duckDetails());
		*/
		System.out.println(Duck.duckCount);

	}

}
