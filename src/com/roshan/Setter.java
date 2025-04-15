package com.roshan;
class PersonDemo{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Setter {
	public static void main(String[] args) {
		PersonDemo p1 = new PersonDemo();
		p1.setId(10);
		p1.setName("ABC");
		
		System.out.println("Id  - "+p1.getId());
		System.out.println("Name - "+p1.getName());
	}
}
