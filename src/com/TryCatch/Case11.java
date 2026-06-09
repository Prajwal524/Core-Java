package com.TryCatch;

public class Case11 {

	public static void main(String[] args) {
		try {
			System.out.println("start of the program");
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("hii");
		finally {
			System.out.println("end of program");
		}
	}

}
