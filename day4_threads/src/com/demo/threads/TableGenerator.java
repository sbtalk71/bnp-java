package com.demo.threads;

public class TableGenerator {

	public synchronized void printTable(int num) {
		try {
			System.out.println(Thread.currentThread().getName()+" aquired Lock");
			for (int i = 1; i < 11; i++) {
				System.out.println(num + " X " + i + " =" + (i * num));
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
