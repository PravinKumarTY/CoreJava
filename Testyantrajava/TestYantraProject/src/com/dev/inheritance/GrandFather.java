package com.dev.inheritance;

public class GrandFather {
   static GrandFather g=new GrandFather();
   String lastname="Stark";
   String name="Torrhen";
	public static void main(String[] args) {
	   g.printName();
	}
    public void printName() {
    	
    	System.out.println(name+" "+lastname);
    }
}