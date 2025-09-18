package com.tns.noaccessmodifier;

public class Myclass {
	private int section;
	static int slno=100;;
	
	static{
		System.out.println("Static block");
	}
	
	public Myclass() {
		super();
		System.out.println("Default constructor");
	}
	static void display() {
		System.out.println("Static method");
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
}
