package com.MethodOverloading;

public class MainPayment {

	public static void main(String[] args) {
		OnlinePayment op = new OnlinePayment();
		op.Payment(56, "prajwal@2004");
		op.Payment(56778.0, "sbi@pass_4924");
		op.Payment("netvbanking@id20", "netbanking@pass3456");
		op.Payment(923456789, "creditPass");
	}

}
