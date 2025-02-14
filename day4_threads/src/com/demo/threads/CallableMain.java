package com.demo.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {

	public static void main(String[] args)  throws Exception{
		ExecutorService es=Executors.newCachedThreadPool();
		
		Future<Integer> resultFuture=es.submit(new CallableWorker(3, 4));
		
		System.out.println("After call to callable....");
		
		/*
		 * while(!resultFuture.isDone()) { System.out.println("Waiting for result");
		 * Thread.sleep(500); }
		 */
		
		System.out.println(resultFuture.get());
		System.out.println("After result..");
		
		es.shutdown();

	}

}
