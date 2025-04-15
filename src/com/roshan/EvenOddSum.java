package com.roshan;

import java.util.Scanner;

public class EvenOddSum {
	static void demo() {
		int evenSum=0, oddSum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no 1st is always less than 2nd No - ");
		int first = sc.nextInt();
		System.out.println("Enter 2nd No 2nd no is always greater than 1st - ");
		int second = sc.nextInt();
		if (first<second) {
			for(int i=first;i<=second;i++) {
				if(i%2==0) {
					System.out.println("Even No - "+i);
					evenSum = evenSum +i;
				}else {
					oddSum = oddSum+i;
				}
			}
			System.out.println("Sum of even No - "+evenSum);
			System.out.println("Sum of odd No - "+oddSum);
		}
	else {
			System.out.println("please enter 1st no is less than 2nd No...");
		}
	}
	public static void main(String[] args) {
		demo();
	}
}
