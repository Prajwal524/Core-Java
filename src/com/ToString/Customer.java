package com.ToString;

public class Customer extends Object {

	String name;
	int id;
	String product_bought;
	long phone;

	Customer(String name, int id, String product_bought, long phone) {
		this.name = name;
		this.id = id;
		this.product_bought = product_bought;
		this.phone = phone;
	}

	public String toString() {
		return "[ Name :-"+name+", Id :-"+id+", Product Bought :-"+product_bought+
				"Phone Number"+phone+"]";
	}

	public static void main(String[] args) {
		Customer c = new Customer("Prajwal Y", 203, "Bat", 234567890);
		System.out.println(c);
		System.out.println(c.toString());

	}

}
