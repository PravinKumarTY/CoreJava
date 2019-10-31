package com.dev.methods;

public class SubTractionClass {
	public int subtract(int a,int b) {
		return a-b;
	}
	
	public int subtract(int a,int b,int c) {
		return a-b-c;
	}
	
	public int subtract(int a,int b,int c,int d) {
	    return a-b-c-d;
	}
    
	public static void main(String[] args) {
		SubTractionClass sub=new SubTractionClass();
		int subRes=sub.subtract(20, 10);
		int subRes1=sub.subtract(50,10,20);
		int subRes2=sub.subtract(100,10,20,20);
		System.out.println("Subtraction of 20 and 10 is="+subRes);
		System.out.println("Subtraction of 50,10 and 20 is="+subRes1);
		System.out.println("Subtraction of 100,10,20,20 is="+subRes2);
	}

}
