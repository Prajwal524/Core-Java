package com.TryCatch;

public class Case16 {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("within try start program");
			}
			finally {
				System.out.println("Finally block is always there");
			}
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}

}
