package com.roshan;

public class ThisDemo {
	 ThisDemo() {
		System.out.println("No argument Construtor");
	}
	 ThisDemo(int a){
		 this();
		 System.out.println("Single parameter int value - "+a);
	 }
	 ThisDemo(float b){
		 this(50);//int
		 System.out.println("Single parameter float value - "+b);
	 }
	 public static void main(String[] args) {
		ThisDemo t1 = new ThisDemo(45.23f);
//		ThisDemo t2 = new ThisDemo(20);
//		ThisDemo t3 = new ThisDemo();
	}
}
