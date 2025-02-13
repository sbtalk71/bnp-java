package com.demo.threads;

import java.util.Vector;

public class TableGenMain {

	public static void main(String[] args) throws InterruptedException {
		TableGenerator tg=new TableGenerator();
		TableGenerator tg1=new TableGenerator();
		Thread t1= new Thread(new TablePrintWorker(tg, 4));
		Thread t2= new Thread(new TablePrintWorker(tg, 6));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		

	}

}
