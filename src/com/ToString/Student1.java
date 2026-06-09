package com.ToString;

public class Student1 {
	String name;
	int rollno;

	Student1(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		Student1 s = new Student1("Prajwal", 101);
		System.out.println(s);
	}

}
