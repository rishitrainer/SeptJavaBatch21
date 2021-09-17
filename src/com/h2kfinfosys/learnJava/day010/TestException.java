package com.h2kfinfosys.learnJava.day010;

public class TestException {

	/*
	 * try {
	 * 		// risky code which might throw an Exception
	 * }catch(Exception ex){
	 * 		// Block of code when exception happens
	 * }
	 * 
	 * 1. Define one try-catch for one risk
	 * 2. Multiple catch blocks are allowed
	 * 3. Specific First Generic Later - ChildException first, ParentException Later
	 * 4. finally executes regardless of exception 
	 * 5. try either needs catch or finally
	 * 6. Single Catch can handle multiple exceptions separated by |
	 */
	
	
	public static void main(String[] args)  {
		int[] marks = {12,13,14,14,16,15, 0};
		try {
			Thread.sleep(1000);
			TestException test = new TestException();
			test.handleCustomer(21, "David");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Compile time exception
		
		
		try {
			System.out.println("This is First Element: " + marks[0]);
			System.out.println("This is Last Element: " + marks[2]);
			//float percentage = 100 / marks[6];
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			System.out.println("ArrayIndexOutOfBoundsException " + ex.getMessage());
		}catch(Exception ex) {
			System.out.println("Exception " + ex.getMessage());
		}finally {
			System.out.println("Complete Processing - Send Email");
		}
		System.out.println("Total Marks for Students");

	}

	
	public void handleCustomer(int age, String name) throws InvalidDataException {
		StorePOS pos = new StorePOS();
		pos.validateAge(15);
	}
	
}
