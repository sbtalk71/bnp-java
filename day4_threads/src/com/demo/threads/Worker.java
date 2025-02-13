package com.demo.threads;

public class Worker implements Runnable {

	@Override
	public void run() {
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName+" Starts");
		try {
			for(int i=0;i<10;i++) {
				System.out.println(threadName+" "+i);
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(threadName+" Exits");
	}

}
