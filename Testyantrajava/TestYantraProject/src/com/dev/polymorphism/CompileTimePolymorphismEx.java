package com.dev.polymorphism;

public class CompileTimePolymorphismEx {
	public void printMethod() {
		System.out.println("This no arg printMethod");
	}
	public void printMethod(int x) {
		System.out.println("This is int x arg printMethod");
	}
	public void printMethod(String s) {
		System.out.println("This is String arg printMethod");
	}

	public static void main(String[] args) {
		CompileTimePolymorphismEx cp=new CompileTimePolymorphismEx();
		cp.printMethod();
		cp.printMethod(10);
	}
}
