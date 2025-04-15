package com.roshan;
interface Abc{
	void show();
}
interface PQR extends Abc{
	void display();
}
public class MultipleParent implements PQR{

	public void display() {
		System.out.println("Display Method");
	}
	public void show() {
		System.out.println("Show method...");
	}
	public static void main(String[] args) {
		MultipleParent m1 = new MultipleParent();
		m1.show();
		m1.display();
	}
}
