package com.demo.threads;

public class TablePrintWorker implements Runnable {

	private TableGenerator tableGenerator;
	private int num;
	
	public TablePrintWorker(TableGenerator tableGenerator, int num) {
		this.tableGenerator=tableGenerator;
		this.num=num;
	}
	@Override
	public void run() {
		
		//call TableGenerator.printTable
		//write all necessary code
		
		tableGenerator.printTable(num);
		

	}

}
