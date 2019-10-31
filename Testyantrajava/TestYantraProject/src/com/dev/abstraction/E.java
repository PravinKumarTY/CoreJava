package com.dev.abstraction;

public class E implements Abs{

	@Override
	public void display() {
		System.out.println("display method of interface.");
	}
	public static void main(String[] args) {
		E e=new E();
		e.display();
		Abs.print();
	}

}
