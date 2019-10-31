package com.dev.methods;

public class DivisionClass {
	public double division(int a,int b) {
		return a/b;
	}
	
	public int modular(int a,int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		DivisionClass d=new DivisionClass();
		double divisionRes=d.division(30, 10);
		int modularRes=d.modular(45, 10);
		System.out.println("Division of 30 and 10 is="+divisionRes);
		System.out.println("Modular of 45 and 10 is="+modularRes);
	}
}
