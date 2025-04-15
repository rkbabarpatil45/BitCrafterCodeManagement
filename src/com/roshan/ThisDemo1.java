package com.roshan;

public class ThisDemo1 {
	ThisDemo1(){
		this(10);
		System.out.println("No arg constructor...");
	}
	ThisDemo1(int a){
		System.out.println("Single para - "+a);
	}
	public static void main(String[] args) {
		ThisDemo1 t1 = new ThisDemo1();
	}
}
