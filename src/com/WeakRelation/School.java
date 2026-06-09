package com.WeakRelation;

public class School {

	public static void main(String[] args) {
		System.out.println("==============");
		Student s = new Student("Prajwal Y");
		Teacher t = new Teacher("Sanjay Raghuwanshi", s);
		t.displayTeacher();
	}
}
