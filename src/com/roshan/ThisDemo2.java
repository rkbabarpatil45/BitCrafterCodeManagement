package com.roshan;

public class ThisDemo2 {
	ThisDemo2() {
		this(10);
		System.out.println("No argument...");
	}
	ThisDemo2(int a) {
		this(10.25);
		System.out.println("argument..."+a);
	}
	ThisDemo2(double d){
		System.out.println("Double - "+d);
	}
	public static void main(String[] args) {
		ThisDemo2 t1 = new ThisDemo2();
	}
}
