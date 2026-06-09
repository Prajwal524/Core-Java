package com.MethodOverriding;

public class Company {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.calculate();
		e.shifttiming();
		System.out.println();
		
		Manager m = new Manager();
		m.calculate();
		m.shifttiming();
		System.out.println();
		
		Developer d = new Developer();
		d.calculate();
		d.shifttiming();
		System.out.println();
		
		Intern i = new Intern();
		i.calculate();
		i.shifttiming();
		System.out.println();
		
		Employee e1 = new Manager();
		e1.calculate();
		e1.shifttiming();
		System.out.println();
		
		Employee e2 = new Developer();
		e2.calculate();
		e2.shifttiming();
		System.out.println();
		
		Employee e3 = new Intern();
		e3.calculate();
		e3.shifttiming();
		System.out.println();
		
		
		
		
	}

}
