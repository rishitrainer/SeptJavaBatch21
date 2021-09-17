package com.h2kfinfosys.learnJava.day010;

public class StorePOS {
	
	
	public boolean validateAge(int age) throws InvalidDataException{
		boolean flag = false;
		if(age > 18) {
			System.out.println("Customer Can Buy Alcohol");
			flag = true;
		}else {
			System.out.println("Cannot buy anything");
			throw new InvalidDataException("Invalid Age Exception");
		}
		return flag;
	}

}
