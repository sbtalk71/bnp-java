package com.demo.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		MyDBDriver driver = new MySQLDB();
		
		System.out.println(driver.getConnection());
		System.out.println(driver.getDbDetails());
		
		

	}

}
