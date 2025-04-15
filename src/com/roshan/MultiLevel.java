package com.roshan;

import java.util.Scanner;

class First{
	int n1;
	Scanner sc = new Scanner(System.in);
	void getFirstIp() {
		System.out.println("enter a no - ");
		n1 = sc.nextInt();
	}
}
class Second extends First{
	int n2;
	void getSecIp() {
		System.out.println("Enter 2nd No - ");
		n2=sc.nextInt();
	}
}
class Third extends Second{
	void add() {
		System.out.println(n1+n2);
	}
}
public class MultiLevel {
	public static void main(String[] args) {
		Third t1 = new Third();
		t1.getFirstIp();
		t1.getSecIp();
		t1.add();
	}
}
//first
//second
//third