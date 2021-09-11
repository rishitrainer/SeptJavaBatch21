package com.h2kfinfosys.learnJava.day02;

public class IfElseStatement {

	public static void main(String[] args) {
		int first = 9;
		int second= 9;
		
		boolean result = first > second;
		System.out.println("Is First Greater than second " + result);

		/*
		 * if condition{
		 * 		block of code when condition is true
		 * }else{
		 * 		block of code when condition is false
		 * }
		 * else if - when else has a condition to check
		 */
		
		if (first > second) {
			System.out.println("First Variable is Greater " + first);
		}else if (second > first) {
			System.out.println("Second Variable is Greater " + second);
		}else {
			System.out.println("They are equal");
		}
		System.out.println("Out of IF ELSE");
	}

}
