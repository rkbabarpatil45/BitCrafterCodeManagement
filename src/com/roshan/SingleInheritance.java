package com.roshan;

import java.util.Scanner;

class ParentFirst{
	int n1,n2;
	Scanner sc = new Scanner(System.in);
	void getInput() {
		System.out.println("Enter 1st No - ");
		n1 = sc.nextInt();
		System.out.println("Enter 2nd No - ");
		n2 = sc.nextInt();
		System.out.println("Sub - "+(n1-n2));
	}
}
class Child extends ParentFirst{
	void add() {
		System.out.println("Addtion of given no - "+(n1+n2));
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
//		ParentFirst p1 = new ParentFirst();
//		p1.add();not working 
		Child c1 = new Child();
		c1.getInput();
		c1.add();
	}
}
