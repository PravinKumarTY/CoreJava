package com.dev.inheritance;

public class Daughter extends Father{
    static Daughter d=new Daughter();
    String name="hsghgh";
    @Override
    public void printName() {
    	
    	System.out.println(name+" "+super.name+" "+d.lastname);
    }
	public static void main(String[] args) {
	
       d.printName();
	}

}
