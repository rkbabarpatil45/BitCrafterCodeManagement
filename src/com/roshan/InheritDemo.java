package com.roshan;
class KeyDemo{
	int n1 = 10;
	void display() {
//		this.message();
		System.out.println("This is parent class Method");
	}
	void message() {	
		System.out.println("Message...");
	}
	KeyDemo() {
		System.out.println("Parent class Constructor...");
	}
	KeyDemo(int n1) {//n1 = 20;
		System.out.println("Parent class Patrameterized Constructor..."+(this.n1+n1));
	}
}
public class InheritDemo extends KeyDemo{
	int n1 = 20;
	void show() {
		System.out.println("Child class Method and Addition..."+(super.n1+n1));
		System.out.println("Line 1");
		System.out.println("Line 2");
		super.display();
		System.out.println("Line 3");
		System.out.println("Line 4");
	}
	InheritDemo() {
		super(20);
		System.out.println("Child class Constructor..");
	}
	InheritDemo(int b){
		System.out.println("Child class Parameterized Constructor..."+b);
	}
	public static void main(String[] args) {
		InheritDemo i1 = new InheritDemo();
		i1.show();
//		i1.display();
	}
}
