package com.dev.abstraction;

public abstract class AbstractExample {
	public AbstractExample() {
		System.out.println("This is constructor of abstract class");
	}
  abstract void display();
  public void shoiw() {
	  System.out.println("Concrete method of abstract class.");
  }
}
