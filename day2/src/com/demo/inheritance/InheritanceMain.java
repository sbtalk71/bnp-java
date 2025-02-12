package com.demo.inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		Employee emp= new Employee(10,"Kiran Kumar",200);
		
		System.out.println(emp.getDetails());
		
		
		Trainee te= new Trainee(102, "Jai", 45000, "Good");
		
		System.out.println(te.getDetails());
		
		
		int a=10;
		Object s=new String("A");
		
		String y=(String)s;
		
		double d=a;
		int c=(int)d;
		
		Person p= new Employee(103, "Mr. X", 70000);
	
		
		System.out.println(p.getDetails());
		
		if(p instanceof Employee) {
			Employee e2=(Employee)p;
			
		}
		
		
		Employee emp2=(Employee)new Person(100, "Ramon");
		
		//emp2.getDetails();
		//------------------------------//
		
		printDetails(emp);
		printDetails(te);
		printDetails(p);
		

	}
	
	
	public static void printDetails(Person p) {
		System.out.println(p.getDetails());
	}

}
