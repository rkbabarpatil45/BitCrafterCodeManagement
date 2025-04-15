package com.roshan;

import java.util.Scanner;

class GetIP{
	int n1,n2;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter 1st no - ");
		n1=sc.nextInt();
		System.out.println("Enter 2nd No - ");
		n2=sc.nextInt();
		System.out.println("User Input - "+n1+" "+n2);
	}
}
class Add extends GetIP{
	void addition() {
		System.out.println("Addition - "+(n1+n2));
	}
}
class Result extends Add{
	void resultDemo() {
		System.out.println("Hybrid inheritance");
	}
}
class Sub extends GetIP{
	void substraction() {
		System.out.println("Sub - "+(n1-n2));
	}
}
class Multi extends GetIP{
	void Multiplication() {
		System.out.println("Multi  - "+(n1*n2));
	}
}
class Div extends GetIP{
	void Division() {
		System.out.println("DIv - "+(n1/n2));
	}
}
public class Hierarchical {
	public static void main(String[] args) {
//		GetIP g1= new GetIP();
//		g1.input();
//		Add a1 = new Add();
//		a1.input();
//		a1.addition();
//		a1.resultDemo();
		Result r1 = new Result();
		r1.input();
		r1.addition();
		r1.resultDemo();
		Sub s1 = new Sub();
		s1.input();
		s1.substraction();
		
		Multi m1 = new Multi();
		m1.input();
		m1.Multiplication();
		
		Div d1 = new Div();
		d1.input();
		d1.Division();
	}
}
