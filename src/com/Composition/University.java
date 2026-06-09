package com.Composition;

public class University {
	String universityName;
	Departement dept;

	University(String universityName) {
		this.universityName = universityName;
		dept = new Departement("AI & DS");
	}

	void displayUniversity() {
		System.out.println("University name is " + universityName);
		dept.displayDepartement();
	}

}
