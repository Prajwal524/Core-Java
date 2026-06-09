package com.TryCatch;

public class Case12 {

	public static void main(String[] args) {
		try {
			System.out.println("start of program");
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		
		try {
			System.out.println("Again strt the program");
			System.out.println(20/0);
		}
		catch(Exception e) {
			System.out.println("Again exception is handled ");
		}
	}

}
