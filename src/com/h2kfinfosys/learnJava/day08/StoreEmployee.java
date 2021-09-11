package com.h2kfinfosys.learnJava.day08;
// You can implement any number of interfaces
public class StoreEmployee extends Employee implements Reachable, Cloneable{

	public StoreEmployee() {
		System.out.println(country_code);
	}
	
	@Override
	public String responsibilities() {
		// TODO Auto-generated method stub
		return "Store Keeper";
	}

	@Override
	public boolean validateAddress(String address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
