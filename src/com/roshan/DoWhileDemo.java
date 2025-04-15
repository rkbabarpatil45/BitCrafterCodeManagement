package com.roshan;

public class DoWhileDemo {
		//Syntax
	//Initialization
	//do{
	//body
	//increment/decrement
	//}while(condition);
	static void demo() {
		int i=1;
		do {
			System.out.println("Welcome...");
			i--;
		}while(i>5);
	}
	static void demo2() {
		int i=1;
		while(i>5) {
			System.out.println("welcome back...");
			i--;
		}
	}
	public static void main(String[] args) {
		demo();
		demo2();
	}
}
