package com.roshan;

interface University{
	void bca();
	void bcs();
	void msc();
}
public class Collage implements University{
	public void bca() {
		System.out.println("we have bca collage");
	}
	public void bcs() {
		System.out.println("we have bcs collage");
	}
	public void msc() {
		
	}
}
