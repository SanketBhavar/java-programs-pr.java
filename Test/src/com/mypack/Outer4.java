package com.mypack;

public class Outer4 {
	int x=10;
	static int y=20;
	class Inner4 {
		public void methodOne()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		new Outer4().new Inner4().methodOne();
	}
}
