package com.roshan;

public class ThisKey {
	int num=10;
	 ThisKey(int num) {//this keyword is refer to the current object
		 this.num=num;
		 this.num++;
		 num++;
		System.out.println("Variable - "+num);
		System.out.println("Variable - "+num);
		System.out.println("Local / instance - "+this.num);
	}
	 public static void main(String[] args) {
		 ThisKey t1 = new ThisKey(10);
	}
}
