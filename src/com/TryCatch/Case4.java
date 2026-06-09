package com.TryCatch;

public class Case4 {

	public static void main(String[] args) {
		try {
			System.out.println("start the program");
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("enf of the program");
		}
	}

}
