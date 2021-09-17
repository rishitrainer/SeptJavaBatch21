package com.h2kfinfosys.learnJava.day08;

public abstract class Employee {
	
	private String empId;
	// final variables are constants
	public final String companyName = "Best Buy Inc";
	
	// if method is abstract - class must be abstract
	public abstract String responsibilities();
	
	// Abstract classes can have non abstract methods
	public void printCompanyName() {
		System.out.println("Best Buy Inc.");
		//this.companyName = "SOme other value";
	}
	// final methods cannot be overridden
	public final void salaryCalculations() {
		System.out.println("Created by HR Module, No one should change it");
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
}
