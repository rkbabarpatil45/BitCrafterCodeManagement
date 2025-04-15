package com.roshan;


import java.util.Scanner;

public class IfElseDemo {
	Scanner sc = new Scanner(System.in);
	 void IfElseExe() {
		
		System.out.println("Enter 1st No - ");
		int	first = sc.nextInt();
		System.out.println("Enter 2nd No  - ");
		int second = sc.nextInt();
		//if false it sent to the in the else part
		if (first<second || second <0 ) {
			System.out.println("first value is small");			
		}else {
			System.out.println("Second value is small");
		}
	}
	 void scannerDemo() {
		 System.out.println("Enter Percentage value - ");
		 float percentage = sc.nextFloat();
		 System.out.println(percentage);
		 System.out.println("Enter your Balance - ");
		 double balance = sc.nextDouble();
		 System.out.println(balance);
		 System.out.println("Enter random 2 digits - ");
		 byte digit = sc.nextByte();
		 System.out.println(digit);
		 System.out.println("Enter any character - ");
		 char character = sc.next().charAt(0);
		 System.out.println(character);
		 System.out.println("Enter your name - ");
		 String firstName = sc.next();
		 System.out.println(firstName);
		 System.out.println("Code End");
	 }
	public static void main(String[] args) {
		IfElseDemo i1 = new IfElseDemo();
		//i1.IfElseExe();
		i1.scannerDemo();
	}
}
