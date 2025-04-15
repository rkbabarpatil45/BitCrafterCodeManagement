package com.roshan;
class Demo5{
	
}
interface Roshan{
	void empAttedance();
}
interface Sandip{
	
}
interface Onkar extends Roshan,Sandip{
	void empAttedance(int num);
}
public class MultipleInheri implements Roshan,Onkar{
	public void empAttedance() {
		System.out.println("Your Attendance System...");
	}
	public void empAttedance(int num) {
		System.out.println("Onkar attendance system..."+num);
	}
	public static void main(String[] args) {
		MultipleInheri m1 = new MultipleInheri();
		m1.empAttedance();
		m1.empAttedance(50);
	}
	
	
}
