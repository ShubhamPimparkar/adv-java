package com.emp.empexceptions;

public class EmployeeException extends Exception {
	private String msg;
	public EmployeeException(String msg) {
		super(msg);
	}
}
