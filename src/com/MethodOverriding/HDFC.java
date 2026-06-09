package com.MethodOverriding;

public class HDFC extends Bank{
	
	float balance;
	float withdraw;
	float amount;

	public void rateOfintrest() {
		System.out.println("6%");
	}

	public void withdraw(float withdraw) {
		balance = 8000;
		balance -= withdraw;
		System.out.println("The amount INR " + withdraw + " is succesfully debitted from your account");
	}

	public void transfer(float amount) {
		System.out.println("INR " + amount + " is succesfully tranferred from your account to other account");
	}


}
