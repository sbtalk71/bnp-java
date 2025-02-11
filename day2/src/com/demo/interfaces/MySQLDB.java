package com.demo.interfaces;

public class MySQLDB implements MyDBDriver{

	@Override
	public String getConnection() {
		
		return "MySQL DB Connected";
	}

	@Override
	public String getDbDetails() {
		
		return "MYSQL 8.1.0";
	}

}
