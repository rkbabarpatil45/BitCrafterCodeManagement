package com.roshan;
interface Addtion{
	void add();
}
interface Multi2{
	void multi();
}
class Substraction {
	int a =20,b=10;
}
class Result2 extends Substraction implements  Addtion,Multi2 {

	@Override
	public void add() {
		System.out.println("Addition - "+(a+b));
	}
	void sub() {
		System.out.println("Substraction - "+(a-b));
	}
	@Override
	public void multi() {
		System.out.println("Multi - "+(a*b));
	}
}
public class MultipleInheriUsingClassAndInterface {
	public static void main(String[] args) {
		Result2 r1 = new Result2();
		r1.multi();
		r1.add();
		r1.sub();
	}
}
