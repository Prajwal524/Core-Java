package com.ToString;

public class Student4 {
	String name;
	int rollno;

	Student4(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public int hashCode() {
		return 111;
	}

	public static void main(String[] args) {
		Student4 s = new Student4("Prajwal", 101);
		System.out.println(s);
	}

}
