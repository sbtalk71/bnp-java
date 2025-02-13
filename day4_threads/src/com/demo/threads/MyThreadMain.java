package com.demo.threads;

public class MyThreadMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" Starts");
		MyThread t1= new MyThread();
		
		t1.start();
		
		t1.join();
		System.out.println(Thread.currentThread().getName()+" Exits");

	}

}
