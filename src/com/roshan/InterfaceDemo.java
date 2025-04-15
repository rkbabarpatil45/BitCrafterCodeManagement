package com.roshan;
interface Demo4{
	abstract void show();
	void display();
	void addition(int a, int b);
}
public class InterfaceDemo implements Demo4{
	public void show() {
		System.out.println("Welcome to show method...");
	}
	public void addition(int a,int b) {
		System.out.println("addition - "+(a+b));
	}
	public void display() {
		
	}
	public static void main(String[] args) {
		InterfaceDemo i1 = new InterfaceDemo();
		i1.show();
		i1.addition(10, 20);
	}
}
