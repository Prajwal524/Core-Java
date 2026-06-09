package com.Interface;

public class CalculatorImp implements Calculator{

	public void add(int a, int b) {
		System.out.println("answer of add is " + (a + b));
	}

	public void substract(int a, int b) {
		System.out.println("answer of substract is " + (a - b));
	}

}
