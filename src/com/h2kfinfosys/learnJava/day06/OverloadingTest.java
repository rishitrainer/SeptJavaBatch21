package com.h2kfinfosys.learnJava.day06;

public class OverloadingTest {

	/*
	 * Components of methods 
	 * Access Modifier - public , private, protected, default
	 * return type = data type of output
	 * method name - logical - camelCase - same rules of variables
	 * parameters <optional> - Input ()
	 * Method body {}
	 * return <optional> - part of body - output of method - cannot return more than one variable
	 * Exception - Learn later
	 */
	
	public boolean validate(String name) {
		boolean flag = false;
		if (name != null && name.length() > 0) {
			System.out.println("Name is Valid");
			flag = true;
		}
		return flag;
	}
	
	/* 
	 * Overloaded method - exact same name but change in parameters
	 * 1. Number of parameter
	 * 2. Type of Parameter
	 * 
	 * Return type change is not considered 
	 * Variable name change is not respected
	 */
	public boolean validate(String name, String city) {
		boolean flag = false;
		if (city != null && city.length() > 0 && validate(name)) {
			System.out.println("Name and City are Valid");
			flag = true;
		}
		return flag;
	}
	
/*
	public String validate(String name) {
		boolean flag = false;
		if (zipCode > 0) {
			System.out.println("zipCode is Valid");
			flag = true;
		}
		return flag;
	} */
	
	public boolean validate(int zipCode) {
		boolean flag = false;
		if (zipCode > 0) {
			System.out.println("zipCode is Valid");
			flag = true;
		}
		return flag;
	}
	
	
	
	public static void main(String[] args) {
		OverloadingTest test = new OverloadingTest();
		boolean result = test.validate("David", "Marietta");
		System.out.println("Validation Returned " + result);

	}

}
