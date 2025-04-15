package com.roshan;

import java.util.Arrays;

public class ArrDemo {
	int n1;
  void pra() {
	 
	 System.out.println("Variable - "+n1);
	 int roll[] = new int[5];
	 roll[0]=1;
	 roll[1]=6;
	 roll[2]=9;
	 roll[3]=10;
	 roll[4]=5;
	 //System.out.println("Roll - "+roll[0]);//give index positions
//	 for(int i=0;i<roll.length;i++) {
//		 System.out.println("Roll - "+roll[i]);
//	 }
//	 System.out.println("Roll - "+Arrays.toString(roll));
	 for(int dis:roll) {
		 System.out.print("   Roll - "+dis);
	 }
 }
 public static void main(String[] args) {
	 ArrDemo a1 = new ArrDemo();
	 a1.pra();
}
}
