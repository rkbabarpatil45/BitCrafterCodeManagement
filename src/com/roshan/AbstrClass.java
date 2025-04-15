package com.roshan;
abstract class Demo6{
	 int a=10;
	abstract void display();
	void show() {
		System.out.println("show method...");
	}
	Demo6(){
		System.out.println("Abstract constructor...");
	}
}
public class AbstrClass extends Demo6{
	void display() {
		a++;
		System.out.println("Display method..."+a);
	}
	AbstrClass(){
		super();
		System.out.println("Child class Constructor");
	}
	public static void main(String[] args) {
		AbstrClass a1 = new AbstrClass();
		a1.display();
		a1.show();
	}
}
