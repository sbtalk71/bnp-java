package com.demo.threads;

public class Consumer implements Runnable {

	private SharedObj sharedObj;

	public Consumer(SharedObj sharedObj) {
		super();
		this.sharedObj = sharedObj;
	}

	@Override
	public void run() {
		while(true) {
			sharedObj.get();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
