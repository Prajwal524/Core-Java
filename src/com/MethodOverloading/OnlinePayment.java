package com.MethodOverloading;

public class OnlinePayment {
	String upiId;
	String pass;

	int debitCardNo;
	String debitCardPass;

	double creditCardId;
	String creditCardPass;

	String netBankingId;
	String netBankingPass;

	public void Payment(int upiId, String upiPass) {
		System.out.println(upiId);
		System.out.println(upiPass);
	}

	public void Payment(double debitCardNo, String debitCardPass) {
		System.out.println(debitCardNo);
		System.out.println(debitCardPass);
	}

	public void Payment(String netBankingId, String netBankingPass) {
		System.out.println(debitCardNo);
		System.out.println(debitCardPass);
	}

	public void Payment(long creditCardNo, String creditCardPass) {
		System.out.println(debitCardNo);
		System.out.println(debitCardPass);
	}
}
