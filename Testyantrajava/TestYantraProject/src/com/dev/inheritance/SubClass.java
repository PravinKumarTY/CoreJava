package com.dev.inheritance;

public class SubClass extends SuperClass {
	public SubClass() {
		super();
	}
	
	public SubClass(int a) {
		super("pravin",10);
	}
    public SubClass(String s) {
    	super("jdhjsj");
    }
	public static void main(String[] args) {
		
       SubClass s=new SubClass();
       SubClass s1=new SubClass(10);
       SubClass s2=new SubClass("jdfjkdlsj");
	}
}
