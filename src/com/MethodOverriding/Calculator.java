package com.MethodOverriding;

public class Calculator {

	public void add(int a, int b) {
		System.out.println("The sum of int is " + (a + b));
	}

	public void add(float a, float b) {
		System.out.println("The sum of float is " + (a + b));
	}

	public void add(double a, double b) {
		System.out.println("The sum of double is " + (a + b));
	}

	public void sub(float a, float b) {
		System.out.println("The sum of float is " + (a - b));
	}

	public void sub(double a, double b) {
		System.out.println("The sum of double is " + (a - b));
	}

	public void mul(float a, float b) {
		System.out.println("The sum of float is " + (a * b));
	}

	public void mul(double a, double b) {
		System.out.println("The sum of double is " + (a * b));
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(20, 990);
		c.add(456, 67890);
		c.add(456789, 987654);

		c.sub(123456, 234);
		c.sub(67890, 1234);

		c.mul(456, 890);
		c.mul(6789, 234);
	}

}
