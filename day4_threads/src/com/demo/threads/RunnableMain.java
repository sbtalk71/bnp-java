package com.demo.threads;

public class RunnableMain {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1= new Thread(new Worker());
		Thread t2= new Thread(new Worker());
		Thread t3= new Thread(new Worker());
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();

	}

}
