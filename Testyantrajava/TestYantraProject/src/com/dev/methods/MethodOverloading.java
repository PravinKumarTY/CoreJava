package com.dev.methods;

public class MethodOverloading {
	public void print() {
		System.out.println("This is print method with no arg.");
	}
	public int print(int i) {
		System.out.println("this is method with int arg");
		return 1;
	}
	private void print(String s) {
		System.out.println("print method with private access specifier");
	}
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.print(10);
		
	}

}
