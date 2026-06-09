package com.SuperCallingStatement;

public class SuperChild extends SuperParent {
	int id;
	double salary;

	SuperChild(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
		System.out.println("Name of child is : " + name);
		System.out.println("Age of child is : " + name);
		System.out.println("id of child is : " + name);
		System.out.println("salary of child is : " + name);
	}

	public static void main(String[] args) {
		SuperChild s1 = new SuperChild("Dinga", 25, 36, 700000);

	}

}
