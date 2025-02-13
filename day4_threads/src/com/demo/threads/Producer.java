package com.demo.threads;

public class Producer implements Runnable {

	private SharedObj sharedObj;
	
	public Producer(SharedObj sharedObj) {
	
		this.sharedObj = sharedObj;
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			sharedObj.put(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
