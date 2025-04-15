package com.roshan;
class Demo2{
	 Demo2() {
		System.out.println("Parent class No arg Constructor");
	}
	 Demo2(int a){
		 System.out.println("Parent class Single para - "+a);
	 }
	 Demo2(double d){
		 System.out.println("Double constructor - "+d);
	 }
}
public class Demo extends Demo2{
	Demo() {
		super(10.45);
		System.out.println("child class Constructor...");
	}
	void show() {
		System.out.println("Show method...");
	}
	public static void main(String[] args) {
		Demo d1 = new Demo();
	}
}
