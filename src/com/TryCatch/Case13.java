package com.TryCatch;

public class Case13 {

	public static void main(String[] args) {
		try {
			System.out.println("start the program");
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		
		try {
			System.out.println("Again start the program");
		}
		
		finally {
			System.out.println("end of program");
		}
	}

}
