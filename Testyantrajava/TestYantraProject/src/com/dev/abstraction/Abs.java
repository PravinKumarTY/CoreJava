package com.dev.abstraction;
@FunctionalInterface
public interface Abs {
	void display();
	//void show();
	public static void print() {
		System.out.println("print method interface.");
	}
}
