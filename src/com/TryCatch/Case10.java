package com.TryCatch;

public class Case10 {

	public static void main(String[] args) {
		try {
			System.out.println("start the program");
			System.out.println(10/0);
		}
		System.out.println("hii");
		catch(Exception e) {
			System.out.println("exception is handled");
		}
	}

}
