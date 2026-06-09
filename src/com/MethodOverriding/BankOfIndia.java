package com.MethodOverriding;

public class BankOfIndia extends Bank {
	
	float balance;
	float withdraw;
	float amount;
	
	public void rateOfintrest() {
		System.out.println("7.5%");
	}

	public void withdraw(float withdraw) {
		balance = 6000;
		balance -= withdraw;
		System.out.println("The amount INR " + withdraw + "is succesfully debitted from your account");
	}

	public void transfer(float amount) {
		System.out.println("INR " + amount + "is succesfully tranferred from your account to other account");
	}

}



//create a class Bank with 3 methods rateofintrest(),withdraw(),deposit() overrride all 3 method in child 
//class sbi , bank of india , hdfc , icici , call all methods using upcasting concept

//create a class Shape with draw(),area() and override both methods inside child class circle , rectangle , traingle

//create a class Employee with calculate(),shifttiming() overrride both methods inside 
//child class manager , developer , intern and call using upcasting 

//create a class calculator having 3 diff add methods 2 diff substract method 2 diff multplication