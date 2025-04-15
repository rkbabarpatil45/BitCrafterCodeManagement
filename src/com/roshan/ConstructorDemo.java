package com.roshan;

public class ConstructorDemo {
	ConstructorDemo() {
		this(10);
		System.out.println("No arg constructor");
	}
	 ConstructorDemo(int a){
		 this(10,20.50);
		 System.out.println("Parameterized cons - "+a);
	 }
	 ConstructorDemo(double b,int c){
		 System.out.println("Double - "+(b+c));
	 }
	 ConstructorDemo(int x,double y){
		 this(80.46, 56);
		 System.out.println("double para - "+(x+y));
	 }
	 public static void main(String[] args) {
		 ConstructorDemo c1 = new ConstructorDemo();	 
	}
}
