package com.mypack;

public class Outer2 {
	class Inner2 {
		public void methodOne() {
			System.out.println("***Inner Class Method***");
		}
	}
	//Outer class method for accessing inner class method.
	public void methodTwo() {
		Inner2 i = new Inner2();
		i.methodOne();
	}
	public static void main(String[] args) {
		Outer2 o = new Outer2();
		o.methodTwo();
	}
}

/*
 ***Inner Class Method*** 
 */