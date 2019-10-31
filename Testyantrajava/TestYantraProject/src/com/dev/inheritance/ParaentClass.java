package com.dev.inheritance;

public class ParaentClass {
	private void privateMethod() {
		System.out.println("This private method of parant class");
		
	}
	public void printData() {
		System.out.println("this print Data of parent class.");
	}
	final void finalMethod() {
		System.out.println("This final method of parent class.");
	}
	public static void staticMethod() {
		System.out.println("Static method of parent class.");
	}
	public static void main(String[] args) {
		ParaentClass p=new ParaentClass();
		p.printData();
	}
}
