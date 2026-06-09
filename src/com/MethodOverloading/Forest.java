package com.MethodOverloading;

public class Forest {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sleep();
		a.sound();
		System.out.println();

		Dog d = new Dog();
		d.sleep();
		d.sound();
		System.out.println();

		Cat c = new Cat();
		c.sleep();
		c.sound();

	}

}
