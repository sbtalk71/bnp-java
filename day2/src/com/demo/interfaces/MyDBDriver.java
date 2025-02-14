package com.demo.interfaces;

public interface MyDBDriver {

	String ver="2.1.3";
	
	String getConnection();
	String getDbDetails();
	default String getTxSupport() {
		throw new IllegalArgumentException("not implemented");
	};
}
