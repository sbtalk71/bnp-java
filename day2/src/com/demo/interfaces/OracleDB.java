package com.demo.interfaces;

public class OracleDB implements MyDBDriver{

	@Override
	public String getConnection() {
		
		return "Oracle DB Connected";
	}

	@Override
	public String getDbDetails() {
		
		return "Oracle Db 14c";
	}

}
