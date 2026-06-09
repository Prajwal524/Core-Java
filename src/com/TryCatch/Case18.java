package com.TryCatch;

public class Case18 {

	public static void main(String[] args) {
		try {
			System.out.println("start the program");
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		finally {
			finally {
				System.out.println("end of the program");
			}
		}
	}

}
