package com.roshan;


public class Execution {
	int a = 10;
	static int b= 20;
	{
		System.out.println("instance block");
	}
	static{
		System.out.println("static block");
	}
	static{
		System.out.println("static block");
	}
	void demo() {
		System.out.println("instance method");
	}
	static void demo2() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
		
		Execution e1 =new Execution();
		Execution e2 =new Execution();
		demo2();
		e1.demo();
		e2.demo();
		
	}
}
