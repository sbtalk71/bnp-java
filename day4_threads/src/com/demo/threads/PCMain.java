package com.demo.threads;

public class PCMain {

	public static void main(String[] args) throws InterruptedException{
		SharedObj sharedObj=new SharedObj();
		
		Thread t1 = new Thread(new Producer(sharedObj));
		Thread t2 = new Thread(new Consumer(sharedObj));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

	}

}
