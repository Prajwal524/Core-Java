package com.TryCatch;

public class Case6 {

	public static void main(String[] args) {
		try {
			System.out.println("start the program");
			System.out.println(10/0);
		}
		finally {
			System.out.println("end of the program");
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}

}
