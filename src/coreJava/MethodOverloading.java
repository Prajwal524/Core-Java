package coreJava;

public class MethodOverloading {
	void sum(int a, int b) {
		System.out.println("The sum is " + (a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println("The sum is " + (a + b + c));
	}

	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.sum(69, 69);
		m1.sum(10, 200, 80);
	}
}
