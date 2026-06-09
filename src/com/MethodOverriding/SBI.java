package com.MethodOverriding;

public class SBI extends Bank{
	
	float balance;
	float withdraw;
	float amount;

	public void rateOfIntrest() {
		System.out.println("5%");
	}
	
	public void rateOfintrest() {
		System.out.println("4.5%");
	}

	public void withdraw(float withdraw) {
		balance = 9000;
		balance -= withdraw;
		System.out.println("The amount INR " + withdraw + " is succesfully debitted from your account");
	}

	public void transfer(float amount) {
		System.out.println("INR " + amount + " is succesfully tranferred from your account to other account");
	}


}
