package com.roshan;

import java.util.Scanner;

public class Reuse {
	public static void main(String[] args) {
		MakeAAddition m1 = new MakeAAddition();
		m1.add();
		m1.multi();
	}
}
class TakeInput{
	Scanner sc = new Scanner(System.in);
	int first;
	int second;
	void multi() {
		System.out.println("Enter a num - ");
		first = sc.nextInt();
		System.out.println("Enter second No - ");
		second = sc.nextInt();
		int result = first*second;
		System.out.println("result - "+result);
	}
}
class MakeAAddition extends TakeInput{
	void add() {
		System.out.println("Enter a num - ");
		first = sc.nextInt();
		System.out.println("enter a no - ");
		second  = sc.nextInt();
		int addition = first + second;
		System.out.println("Addition - "+addition);
	}
	
}