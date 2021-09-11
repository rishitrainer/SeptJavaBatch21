package com.h2kfinfosys.learnJava.day04;

import java.util.Calendar;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// PriceLoader Batch should execute when store opens
		// Store opening timing depends on days
		
		int day_of_week = 4;
		
		System.out.println("Day of Week is " + day_of_week);
		// String, int. short. byte
		
		switch(day_of_week){
			case 1:
			case 2:{
				System.out.println("PriceLoader runs at 7:00 AM");
				break;
			}
			case 3: 
			case 7: 
			default: {
				System.out.println("PriceLoader runs at 8:00 AM");
				break;

			}
			case 4:
			case 5:{
				System.out.println("PriceLoader runs at 9:00 AM");
				break;
			}
			case 6: {
				System.out.println("PriceLoader runs at 7:30 AM");
				break;
			}
			
		}
		System.out.println("Batch Executed Successfully");

	}

}
