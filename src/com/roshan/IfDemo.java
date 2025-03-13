package com.roshan;

public class IfDemo {
	static void ifExecution() {
		//always return boolean value (true / false)
		//syntax - if(condition)
		int a = 30;
		if(a<20)//{}not compulsory   
			System.out.println("valid NO");//nearst
		System.out.println(" Invalid No");//second nearset
		
	}
	static void withBracket() {
		int b = 30;
		if(b<20) {
			System.out.println("valid NO");
			System.out.println(" Invalid No");
		}
	}
	public static void main(String[] args) {
		ifExecution();
		withBracket();
	}
}
