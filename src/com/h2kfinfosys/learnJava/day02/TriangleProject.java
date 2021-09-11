package com.h2kfinfosys.learnJava.day02;

public class TriangleProject {

	public static void main(String[] args) {
		// Side a , side b, side c
		/*
		 *  (a + b) > c
		 *  (a + c) > b
		 *  (b + c) > a
		 *  
		 *   a = 10
		 *   b = 6
		 *   c = 1
		 */
		int a = 10;
		int b = 6;
		int c = 5;
		
		boolean result1 = (a + b) > c;
		boolean result2 = (a + c) > b;
		boolean result3 = (b + c) > a;
		
		System.out.println("Triangle is Possible ? " + (result1 && result2 && result3));
		
		/*
		 * if((a+b) > c){ if((a + c) > b) { if((b + c) > a) {
		 * System.out.println("Triangle is possible"); }else {
		 * System.out.println("Triangle is NOT possible (b + c) > a)"); } }else {
		 * System.out.println("Triangle is NOT possible (a + c) > b"); } }else {
		 * System.out.println("Triangle is NOT possible (a+b) > c"); }
		 */
		
		if (((a+b) > c) && ((a + c) > b) && ((b + c) > a)) {
			System.out.println("Triangle is possible");
		}else {
			System.out.println("Triangle is NOT possible (b + c) > a)");
		}
		
		// Logical Operators - works on Boolean - && - AND
		/*
		 * 		S1		S2		Result
		 * 		T		T		T
		 * 		T		F		F
		 * 		F		T		F
		 * 		F		F		F
		 * 
		 * && = * 
		 * T = 1 F = 0
		 */
		
		// Logical Operators - works on Boolean - || - OR
		/*
		 * 		S1		S2		Result
		 * 		T		T		T
		 * 		T		F		T
		 * 		F		T		T
		 * 		F		F		F
		 * 
		 * || = + 
		 * T = +ve F = 0
		 */
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// Negation  - NOT !
		// !true
		System.out.println(!true);
		System.out.println(!false);

		
	}

}
