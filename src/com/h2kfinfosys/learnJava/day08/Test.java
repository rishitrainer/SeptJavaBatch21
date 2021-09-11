package com.h2kfinfosys.learnJava.day08;

public class Test {
	
	public static void main(String[] args) {
		// Abstract classes cannot be instantiated 
		Employee emp = new StoreEmployee();
		emp.setEmpId("1000");
		System.out.println(emp.responsibilities());
		System.out.println(Reachable.country_code);
		// Interfaces cannot be instantiated - can be used as Referece type
		Reachable emp1 = new StoreEmployee();
		
	}

}
