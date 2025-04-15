package com.roshan;

class Demo1{
	public int n1;
	int n2=20;
	void display() {
		System.out.println("Parent class Method...");
	}
	//	static void m1() {
	//		System.out.println("M1 in parenjt class...");
	//	}
}
public class Hiding extends Demo1{
	void display() {
		System.out.println("Child class Method..."+(n1+n2));
	}
	public static void main(String[] args) {
		Hiding h1 = new Hiding();
		h1.display();
		Demo1 d1 = new Demo1();
		d1.display();
	}
}
