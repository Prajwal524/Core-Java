package com.Interface;

public interface Calculator {

	void add(int a, int b);

	void substract(int a, int b);

	default void multiply(int a, int b) {
		System.out.println("answer is of multiply " + a * b);
	}

	static void division(int a, int b) {
		System.out.println("answer of division " + a / b);
	}
}

// 