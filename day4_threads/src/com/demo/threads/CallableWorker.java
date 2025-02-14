package com.demo.threads;

import java.util.concurrent.Callable;

public class CallableWorker implements Callable<Integer> {

	private int a;
	private int b;
	
	public CallableWorker(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("inside Callable Thread "+Thread.currentThread().getName());
		Thread.sleep(5000);
		return a+b;
	}

}
