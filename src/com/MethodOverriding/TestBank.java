package com.MethodOverriding;

public class TestBank {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.rateOfintrest();
		
		HDFC hdfc = new HDFC();
		hdfc.rateOfintrest();
		
		SBI sbi = new SBI();
		sbi.rateOfIntrest();
		
	}

}
