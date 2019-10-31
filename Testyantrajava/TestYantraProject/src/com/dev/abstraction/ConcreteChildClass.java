package com.dev.abstraction;

public class ConcreteChildClass extends ParantAbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteChildClass cc=new ConcreteChildClass();
		cc.show();
		cc.display();
	}

	@Override
	public void show() {
	    System.out.println("This is show method of ConcreteChildClass");
		
	}

	@Override
	public void display() {
		System.out.println("This is display method of ConcreteChildClass");	
	}

}
