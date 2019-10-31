package com.dev.abstraction;

public class ConcreteGrandChildClass extends AbstractChildClass{

	public static void main(String[] args) {
		ConcreteGrandChildClass cgc=new ConcreteGrandChildClass();
		cgc.show();
		cgc.display();
	}

	@Override
	public void show() {
		System.out.println("This is show method of ConcreteGrandChildClass");
		
	}

	/*@Override
	public void display() {
		System.out.println("This is display method of ConcreteGrandChildClass");
		
	}*/

}
