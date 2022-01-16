package com.org.autotype;

public class AOneClass {

	BOneClass b;  //simple String

	public AOneClass() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Class A");
	}
	
	public void setB(BOneClass b) {
		this.b = b; 
	}
	public BOneClass getGet() {
		return b;
	}
	
	void PrintName() {
		System.out.println("Hello AOneClass");
	}
	
	public void display() {
		PrintName();  //Aone Class Mtd
		b.PrintName(); //Bpne Class Mtd
	}
}
