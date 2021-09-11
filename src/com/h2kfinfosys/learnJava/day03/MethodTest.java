package com.h2kfinfosys.learnJava.day03;

public class MethodTest {
	
	String testVariable = "For Variable Testing";
	static String company_name = "Best Buy Inc";

	public static void main(String[] args) {
		// Object Creation - instance
		// ClassName objectName = new ClassName();
		MethodTest test1 = new MethodTest();
		System.out.println(test1.testVariable);
		test1.say_hello();
		System.out.println(test1.giveStoreName(1000));
		System.out.println(MethodTest.company_name); // accessible at class Level
		
		MethodTest test2 = new MethodTest();
		test2.testVariable = "For Test2 Variable Testing";
		System.out.println(test2.testVariable);
		test2.say_hello();
		System.out.println(test2.giveStoreName(2000));
		
		System.out.println("Unchaged  :: " + test1.testVariable);

	}

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
	
	public String giveStoreName(int storeNumber) {
		String storeName = null;
		if(storeNumber > 100) {
			storeName = "Store_" + storeNumber;
		}
		return storeName;
	}
	
	
	public void say_hello() {
		System.out.println("Hello World");
	}
	
}
