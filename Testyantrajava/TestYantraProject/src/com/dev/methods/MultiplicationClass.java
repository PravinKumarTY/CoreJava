package com.dev.methods;

public class MultiplicationClass {
	public int multiplication(int a,int b) {
		return a*b;
	}
	public int multiplication(int a,int b,int c) {
		return a*b*c;
	}
    public int multiplication(int a,int b,int c,int d) {
    	return a*b*c*d;
    }
	public static void main(String[] args) {
		MultiplicationClass mul=new MultiplicationClass();
		int mulRes1=mul.multiplication(10, 20);
		int mulRes2=mul.multiplication(10, 20, 30);
		int mulRes3=mul.multiplication(10, 20, 30, 40);
		System.out.println("Multiplication of 10 and 20 is="+mulRes1);
		System.out.println("Multiplication of 10, 20 and 30 is="+mulRes2);
		System.out.println("Multiplication of 10, 20,30 and 40  is="+mulRes3);
	}

}
