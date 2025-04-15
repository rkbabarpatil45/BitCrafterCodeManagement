package com.roshan;

import java.util.Arrays;

public class Array {
/*
 * int marks[];Declaration
 * */
	//int marks[] = new int[5];Declaration and memory allocation
	//int marks[]={10,20,30};//Declaration and memory allocation automatically
	void demo() throws InterruptedException {
		int marks[] = new int[5]; /*index position is always starts from 0 (size - 1) 
		and size is always count from 1*/
		//int mark2[]={10,20,30};//We not use it.
		System.out.println("Size of mark - "+marks.length);
		//System.out.println("Size of marks 2 - "+mark2.length);
		marks[0]=10;
		marks[1]=25;
		marks[2]=30;
		marks[3]=40;
		marks[4]=50;
		System.out.println("marks - "+marks[4]);
//		System.out.println("marks - "+marks[3]);
		marks[3]=45;
		System.out.println("length - "+marks.length);
//		System.out.println("marks - "+marks[3]);
		for (int ele : marks) {//(n-1) foreach loop enhance for loop
			System.out.println("Array element - "+ele);
		}
////		System.out.println("using For loop");
		for(int i=0;i<marks.length;i++) { //simple for loop
			System.out.println("Array element - "+marks[i]);
		}
		System.out.println("Array Element - "+Arrays.toString(marks));//using Arrays class
		Arrays.copyOf(marks, 10);
		System.out.println(marks.length);
	}
	public static void main(String[] args) throws InterruptedException {
		Array a1 = new Array();
		a1.demo();
	}
}
