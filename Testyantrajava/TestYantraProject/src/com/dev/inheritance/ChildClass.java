package com.dev.inheritance;

public class ChildClass extends ParaentClass {
    @Override
	public void printData() {
		System.out.println("This is printData of Child class.");
	}
    
    /*@Override
     * static method can not be overridden
    public void privateMethod() {    
    	System.out.println("this overridden private method of parent ");
    }*/
    
    /*
     * final member can be inherited but can not be overridden
     *  
     * public void finalMethod() {
    	System.out.println("final method child class");
    }*/
    
    /*@Override
     * 
     * static method can not be overridden.
     * 
    public void staticMethod() {
    	System.out.println("this static method of child class");
    }*/
	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		c.printData();
		c.printData();
	}
}
