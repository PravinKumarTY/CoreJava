package com.dev.methods;

public class AddClass {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	public static void main(String[] args) {
		AddClass add=new AddClass();
		int addRes1=add.add(10, 20);
		int addRes2=add.add(10, 20, 30);
		int addRes3=add.add(10, 20, 30, 40);
		System.out.println("Addition of 10 and 20 is ="+addRes1);
		System.out.println("Addition of 10,20 and 30 is ="+addRes2);
		System.out.println("Addition of 10,20,30 and 40 is ="+addRes3);

	}
}
