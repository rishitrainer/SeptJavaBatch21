package com.h2kfinfosys.learnJava.day05;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 *do {
		 * 		block of code executed regardless condition is true or not
		 * 		condition modifier
		 * }while condition
		 */
		
		int counter = 11;
		int total = 0;
		do {
			System.out.println("Counter Value " + counter);
			total = total + counter;
			counter++; // increase value by 1
		}while (counter <= 10);
		System.out.println("Total " + total);
		

	}

}
