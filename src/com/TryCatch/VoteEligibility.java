package com.TryCatch; 

import java.util.Scanner;

public class VoteEligibility {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age = sc.nextInt();
		
		try {
			if(age < 18 ) {
				throw new Exception("Not eligible to vote");
			}
			else {
				System.out.println("Eligible to vote");
			}
		}
		catch(Exception e) {
			System.out.println(e);   
		}
	}
}