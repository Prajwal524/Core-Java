package com.ToString;

public class Student2 {
	String name;
	int rollno;

	Student2(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public String toString() {
		return "name " + name + " rollno " + rollno;
	}

//	public int hashCode() {
//		return 111;
//	}

	public static void main(String[] args) {
		Student2 s = new Student2("Prajwal", 101);
		System.out.println(s);
	}

}
