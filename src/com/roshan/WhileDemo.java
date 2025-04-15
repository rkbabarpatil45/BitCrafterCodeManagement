package com.roshan;

import java.util.Scanner;

public class WhileDemo {
	static void demo() {
		//Initialization;
		//while(condition){
		//body
		//increment/Decrement
		//}
		Scanner sc = new Scanner(System.in);
		int i=1;//Initialization;
		System.out.println(++i);
		System.out.println("give the no when you want to stop - ");
		int con = sc.nextInt();
		
		while (i<=con) {//while(condition)
			System.out.println("welcome");
			i++;//increment/Decrement
		}
	}
	public static void main(String[] args) {
		demo();
	}
}
