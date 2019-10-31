package com.dev.constructor;

public class ConstructorOverlopading {
	
	public ConstructorOverlopading() {//no argument constructor
		System.out.println("this is consructor with no argument.");
	}
	public ConstructorOverlopading(int i) {
		System.out.println("this is consructor with int argument.");
	}
	public ConstructorOverlopading(String s) {
		System.out.println("this is string parameter constructor.");
	}
	
	public ConstructorOverlopading(String s,int a) {
		System.out.println("this is string parameter constructor. and int ");
	}
	
	public ConstructorOverlopading(int a,String s) {
		System.out.println("this is int a and String s parameter constructor. ");
	}
	public ConstructorOverlopading(int a,int b,int c) {
		System.out.println("this is int a ,int b and int c ");
	}

	public static void main(String[] args) {
		ConstructorOverlopading ce=new ConstructorOverlopading();
		System.out.println(ce);
		ConstructorOverlopading ce1=new ConstructorOverlopading(10);
		System.out.println(ce1);
		ConstructorOverlopading ce2=new ConstructorOverlopading("Pravin");
		System.out.println(ce2);
		ConstructorOverlopading ce3=new ConstructorOverlopading("Pravin",10);
		System.out.println(ce3);
		ConstructorOverlopading ce4=new ConstructorOverlopading(20,"pravin");
		ConstructorOverlopading ce5=new ConstructorOverlopading(10,20,30);
	}
}
