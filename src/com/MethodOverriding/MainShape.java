package com.MethodOverriding;

public class MainShape {

	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw();
		s.area();
		System.out.println();
		
		Circle c = new Circle();
		c.area();
		c.draw();
		System.out.println();
		
		Rectangle r = new Rectangle();
		r.area();
		r.draw();
		System.out.println();
		
		Traingle t = new Traingle();
		t.area();
		t.draw();
		
	}

}
