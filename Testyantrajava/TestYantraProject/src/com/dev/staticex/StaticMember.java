package com.dev.staticex;

public class StaticMember {
    int j=0;
    static int i=0;
    
	public static void main(String[] args) {
		int local=5;
		System.out.println(i);
		System.out.println(local);
	}
	public void printData() {
		System.out.println(i);
	}
}
