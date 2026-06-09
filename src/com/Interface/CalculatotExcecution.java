package com.Interface;

public class CalculatotExcecution {

	public static void main(String[] args) {
		Calculator c = new CalculatorImp();
		c.add(10, 20);
		c.substract(20, 10);
		c.multiply(11, 11);
		Calculator.division(50, 10);
	}

}

