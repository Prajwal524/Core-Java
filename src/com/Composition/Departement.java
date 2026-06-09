package com.Composition;

public class Departement {
	String deptName;

	Departement(String deptName) {
		this.deptName = deptName;
	}

	void displayDepartement() {
		System.out.println("Departement name is " + deptName);
	}
}
