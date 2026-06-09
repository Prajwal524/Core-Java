package com.ToString;

public class Student3 {
	String name;
	int rollno;

	Student3(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

//	public String toString() {
//		return "name " + name + " rollno " + rollno;
//	}

	public static void main(String[] args) {
		Student3 s = new Student3("Prajwal", 101);
		System.out.println(s.toString());
	}

}
