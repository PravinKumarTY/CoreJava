package com.dev.inheritance;

public class SuperClass {
	public SuperClass() {
		System.out.println("This is zero arg of SuperClass constructor.");
	}
	public SuperClass(int a) {
		System.out.println("This is int arg of SuperClass constructor.");
	}
	public SuperClass(String s) {
		System.out.println("This is String arg of SuperClass constructor.");
	}
	public SuperClass(String s,int i) {
		System.out.println("This is String and int arg of SuperClass constructor.");
	}
	public SuperClass(int i,String s) {
		System.out.println("This is int and String arg of SuperClass constructor.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
