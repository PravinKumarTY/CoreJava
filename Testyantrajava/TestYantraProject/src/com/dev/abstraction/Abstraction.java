package com.dev.abstraction;

public class Abstraction extends AbstractExample{
    public Abstraction() {
		// TODO Auto-generated constructor stub
    	System.out.println("This is constructor of Abstract.");
	}

	@Override
	void display() {
		System.out.println("This is the implemented abstract method");
	}
	public static void main(String[] args) {
		Abstraction abs=new Abstraction();
		abs.display();
		abs.shoiw();
	}

}
