package com.mypack;

public class ToStringMethod {
	String name;
	int rollno;
	
	ToStringMethod(String name, int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
	public static void main(String[] args) {
		ToStringMethod t1 = new ToStringMethod("Sanket", 101);
		ToStringMethod t2 = new ToStringMethod("Rahul", 102);
		System.out.println(t1);
		System.out.println(t1.toString());
		System.out.println(t2);
	}
}
