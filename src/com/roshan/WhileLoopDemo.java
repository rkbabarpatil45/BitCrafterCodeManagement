package com.roshan;

import java.util.Scanner;

public class WhileLoopDemo {
	 WhileLoopDemo() {
		System.out.println("Constructor....");	
		}
	 void demo() {
		Scanner sc = new Scanner(System.in);
		String resp = "Yes";
		while(resp.equalsIgnoreCase("Yes")) {
			System.out.println("Welcome Back...");
			System.out.println("Do you want Continue(yes/no) - ");
			resp=sc.next();
		}
		System.out.println("Looping finish...");
	}
	 
	public static void main(String[] args) {
		WhileLoopDemo w1 = new WhileLoopDemo();
		//w1.demo();
	}
}
