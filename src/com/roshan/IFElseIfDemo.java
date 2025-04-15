package com.roshan;

import java.util.Scanner;

public class IFElseIfDemo {
	//Syntax - 
	//if(condition){
	//body
	//}elseif(condition){
	//body
	//}else{
	//body
	//}
	Scanner sc = new Scanner(System.in);
	void checkGreaterNo() {
		System.out.println("Enter 1st No - ");
		int fir = sc.nextInt();
		System.out.println("Enter 2nd No - ");
		int sec = sc.nextInt();
		System.out.println("Enter 3rd No - ");
		int thr = sc.nextInt();
		if(fir>sec && fir>thr) {
			System.out.println("First No is grater - "+fir);
		}else if(sec>fir && sec>thr) {
			System.out.println("Second No is greater - "+sec);
		}else if (thr>fir && thr> sec) {
			System.out.println("Third No is greater - "+thr);
		}else {
			System.out.println("All no are equal...");
		}
	}
	public static void main(String[] args) {
		IFElseIfDemo i1 = new IFElseIfDemo();
		i1.checkGreaterNo();
	}
}
