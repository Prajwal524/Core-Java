package com.TryCatch;

public class Case15 {

	public static void main(String[] args) {
		try 
			System.out.println("hii");
			System.out.println(10/0);
		
		catch(Exception e) 
			System.out.println("hello");
		finally {
			System.out.println("end of program");
		}
	}

}
