package com.TryCatch;

public class Case2 {

	public static void main(String[] args) {
		try {
			System.out.println("start the program");
			System.out.println(10 / 0);
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception handled by arithmetic exception");
		} 
		catch (Exception e) {
			System.out.println("Exception is handled");
		}
	}

}
