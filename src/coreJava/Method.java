package coreJava;

public class Method {
	String name;

	Method(String name) {
		this.name = name;
	}

	void sing() {
//		this.name=name;
		System.out.println(this.name + " is singing");
		dance();
	}

	void dance() {
//		this.name=name;
		System.out.println(this.name + " is dancing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method m1 = new Method("Epstien");
		m1.sing();
		Method m2 = new Method("Modi");
		m2.dance();

	}
}
