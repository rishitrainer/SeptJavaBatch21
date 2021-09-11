package com.h2kfinfosys.learnJava.day08;

public abstract class Employee {
	
	private String empId;
	
	// if method is abstract - class must be abstract
	public abstract String responsibilities();
	
	// Abstract classes can have non abstract methods
	public void printCompanyName() {
		System.out.println("Best Buy Inc.");
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
}
