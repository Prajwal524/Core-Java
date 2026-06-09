package com.ToString;

public class NewCustomer {
	String Customer_name ;
	int Customer_id;
	
	NewCustomer(int Customer_id,String Customer_name){
		this.Customer_id= Customer_id;
		this.Customer_name = Customer_name ;
	}

	public static void main(String[] args) {
		NewCustomer c1 = new NewCustomer(701, "Ravi");
		NewCustomer c2 = new NewCustomer(702, "Shathry");
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));
		NewCustomer c3 = c2 ;
		System.out.println(c3.equals(c2));
		System.out.println(c3.equals(c1));

	}

}
