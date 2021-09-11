package com.h2kfinfosys.learnJava.day06;

public class ConstructorTest {
	
	/*
	 * Components of Constructor 
	 * Access Modifier - public , private, protected, default
	 * return type = No Return type
	 * method name - exactly same as CLass Name
	 * parameters <optional> - Input ()
	 * Method body {}
	 * return <optional> - COnstructor do not return anything
	 * Exception - Learn later
	 */
	// no-arg constructor or default constructor
	public ConstructorTest() {
		System.out.println("This will execute Every Single time when instance is created");
	}
	
	/*
	 * Constructor follows overloading Rules
	 */
	public ConstructorTest(String instanceName) {
		System.out.println("This will execute Every Single time " + instanceName + " is now created");
	}
	
	public ConstructorTest(int squence) {
		System.out.println("This will execute Every Single time instance" + squence + " is now created");
	}
	
	// Constructor call must be first statement of constructor
	public ConstructorTest(String instanceName, int squence) {
		this(instanceName);
		System.out.println("This will execute Every Single time instance" + squence + " is now created");
		//this(squence);
	}
	

	public static void main(String[] args) {
		// Object Creation - instance
		// ClassName objectName = new Constructor();
		ConstructorTest test1 = new ConstructorTest("test1", 1);
		ConstructorTest test2 = new ConstructorTest("test2");
		ConstructorTest test3 = new ConstructorTest(3);
		
	}
}
