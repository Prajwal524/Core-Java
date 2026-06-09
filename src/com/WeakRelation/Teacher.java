package com.WeakRelation;

public class Teacher {
	String teacher_name;
	Student student;

	Teacher(String teacher_name, Student student) {
		this.teacher_name = teacher_name;
		this.student = student;
	}

	void displayTeacher() {
		System.out.println("Teacher name is " + teacher_name);
		student.displayStudent();
	}
}
