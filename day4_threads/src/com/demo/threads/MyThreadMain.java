package com.demo.threads;

public class MyThreadMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" Starts");
		MyThread t1= new MyThread();
		MyThread t2= new MyThread();
		MyThread t3= new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(Thread.currentThread());
		System.out.println(t1);
		t1.setName("MyThread-1");
		t1.setPriority(8);
		System.out.println(t1);
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println(Thread.currentThread().getName()+" Exits");

	}

	//Thread Priority : MIN_PRIORITY=1, NORM_PRIORITY=1, MAX_PRIORITY=10
}
