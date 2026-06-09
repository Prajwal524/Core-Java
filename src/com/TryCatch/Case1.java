package com.TryCatch;

public class Case1 {

	public static void main(String[] args) {
		try{
			System.out.println("strt the program");
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("Exception is handled");
			System.out.println("end of the program");
		}
	}

}
