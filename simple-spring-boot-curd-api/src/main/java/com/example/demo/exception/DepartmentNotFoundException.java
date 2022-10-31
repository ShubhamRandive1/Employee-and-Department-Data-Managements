package com.example.demo.exception;

public class DepartmentNotFoundException extends Exception{
	
	public DepartmentNotFoundException() {
		super();
	}
	
	public DepartmentNotFoundException(String msg) {
		
		super(msg);
	}

}
