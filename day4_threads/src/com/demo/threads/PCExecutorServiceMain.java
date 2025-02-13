package com.demo.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PCExecutorServiceMain {

	public static void main(String[] args) {
		SharedObj sharedObj=new SharedObj();
		
		//ExecutorService es= Executors.newFixedThreadPool(3);
		ExecutorService es= Executors.newCachedThreadPool();
		
		es.execute(new Producer(sharedObj));
		es.execute(new Consumer(sharedObj));
		
		
		
		es.shutdown();

	}

}
