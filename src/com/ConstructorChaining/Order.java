package com.ConstructorChaining;

public class Order {
	String productName;
	String color;
	double price;

	Order(String productName) {
		this(productName, "blue", 900000);
		System.out.println("order is placed");
	}

	Order(String productName, String color, double price) {
		this.productName = productName;
		this.color = color;
		this.price = price;
		System.out.println("product name is " + productName);
		System.out.println("product color is " + color);
		System.out.println("product price is " + price);

	}
}
