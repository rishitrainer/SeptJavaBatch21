package com.h2kfinfosys.learnJava.day04;

public class WhileLoop {

	// Add 1 to 10
	
	public static void main(String[] args) {
		/*
		 * while condition{
		 * 		block of code executed when condition is true
		 * 		condition modifier
		 * }
		 */
		int counter = 11;
		int total = 0;
		while (counter <= 10) {
			System.out.println("Counter Value " + counter);
			total = total + counter;
			counter++; // increase value by 1
		}
		System.out.println("Total " + total);
	}

}
