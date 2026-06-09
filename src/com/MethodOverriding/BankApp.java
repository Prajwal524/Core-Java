package com.MethodOverriding;

public class BankApp {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.rateOfintrest();
		bank.withdraw(10);
		bank.transfer(50);
		System.out.println();
		System.out.println("=======================================================");
		
		
		HDFC hdfc = new HDFC();
		hdfc.rateOfintrest();
		hdfc.withdraw(22);
		hdfc.transfer(88);
		System.out.println();
		System.out.println("=======================================================");
		
		SBI sbi = new SBI();
		sbi.rateOfintrest();
		sbi.withdraw(55);
		sbi.transfer(87);
		System.out.println();
		System.out.println("=======================================================");
		
		BankOfIndia boi = new BankOfIndia();
		boi.rateOfintrest();
		boi.withdraw(567);
		System.out.println();
		System.out.println("=======================================================");
		
		Bank bank1 = new HDFC();
		bank1.rateOfintrest();
		bank1.withdraw(600);
		bank1.transfer(900);
		System.out.println();
		System.out.println("=======================================================");
		
		Bank bank2 = new SBI();
		bank2.rateOfintrest();
		bank2.withdraw(550);
		bank2.transfer(340);
		System.out.println();
		System.out.println("=======================================================");
		
		Bank bank3  = new BankOfIndia();
		bank3.rateOfintrest();
		bank3.withdraw(550);
		bank3.transfer(340);
		System.out.println("=======================================================");
	
	}

}
