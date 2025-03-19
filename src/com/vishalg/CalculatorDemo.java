package com.vishalg;

import java.util.Scanner;

public class CalculatorDemo {
	void Demo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number =");
		int first=sc.nextInt();
		System.out.println("Enter Second Number =");
		int second=sc.nextInt();
		System.out.println("Following are your options -");
		System.out.println("For Additon press 1");
		System.out.println("For Substraction press 2");
		System.out.println("For Multiplication press 3");
		System.out.println("For Division press 4");
		System.out.println("Plese Enter Your Choice -");
		int choice=sc.nextInt();
		if (choice==1) {
			System.out.println("Addition is="+(first+second));
		}else if (choice==2) {
			System.out.println("Substraction is="+(first-second));
		}else if (choice==3) {
			System.out.println("Multiplication is="+(first*second));
		}else if (choice==4) {
			System.out.println("Division is="+(first/second));
		}else {
			System.out.println("Invalid Choice...Try again");
		}
	}
	public static void main(String[] args) {
		CalculatorDemo cal=new CalculatorDemo();
		cal.Demo();
	}
}
