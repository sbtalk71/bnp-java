package com.demo.threads;

public class SharedObj {

	 private int data=0;
	 private boolean valueSet=false;
	 
	 public synchronized void put(int data) {
		 if(valueSet) {
			 try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 this.data=data;
		 System.out.println("PUT :"+data);
		 valueSet=true;
		 notify();
	 }
	 
	 
	 public synchronized void get() {
		 if(!valueSet) {
			 try {
				 wait();
				 
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		 }
		 System.out.println("GOT : "+data);
		 valueSet=false;
		 notify();
	 }
}
