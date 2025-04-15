package com.roshan;

public class Person {
	String name;
	int age;
	//control+alt+s

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Person p1 =new Person();
		p1.setName("Sandip");
		p1.setAge(23);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		Person p2 = new Person();
		p2.setName("Prajyot");
		p2.setAge(23);
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	}
}
