package com.TryCatch;

public class Case14 {

	public static void main(String[] args) {
		try {
			System.out.println("start of program");
			System.out.println(10/0);
		}
		catch(Exception e) {
			try {
				System.out.println("within catch again strt program");
				System.out.println(20/0);
			}
			catch(Exception e1) {
				System.out.println("Again exception handled");
			}
		}
	}

}
