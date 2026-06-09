package com.TryCatch;

public class Case3 {

	public static void main(String[] args) {
		try {
			System.out.println("start the program");
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Exception is handled");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled by arithemetic exception");
		}
	}

}
