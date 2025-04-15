package com.roshan;

import java.util.Scanner;

public class SwitchDemo {
	static void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st No - ");
		int fir = sc.nextInt();
		System.out.println("Enter 2nd No - ");
		int sec = sc.nextInt();
		boolean flag = false;
		do {
		System.out.println("These are our options - ");
		System.out.println("For Addition press 1");
		System.out.println("For Substraction press 2");
		System.out.println("For Multiplication press 3");
		System.out.println("For Division press 4");
		System.out.println("Enter your Choice - ");
		int choice = sc.nextInt();
		switch (choice) {
			case 4:
				System.out.println("Division"+(fir/sec));
				break;
			case 2:
				System.out.println("Substraction - "+(fir-sec));
				break;
			case 1:
				System.out.println("Addition - "+(fir+sec));
				break;
			case 3:
				System.out.println("Multiplication - "+(fir*sec));
				break;
			default :
				System.out.println("Wrong Choice choose correct Choice");		
		}
		System.out.println("Do you want perform any other operation - ");
		String ch = sc.next();
		if(ch.equalsIgnoreCase("yes")) {
			flag = true;
		}else {
			flag = false;
		}
		}while(flag);
		System.out.println("End of program...");
		
	}
	public static void main(String[] args) {
		calculator();
	}
}
