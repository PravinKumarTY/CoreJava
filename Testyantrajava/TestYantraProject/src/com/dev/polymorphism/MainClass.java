package com.dev.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		cc.printData();
		ParantClass pc=new ParantClass();
		pc.printData();
		/*In abo example whenever we are trying to call printData() method by child class object
		its showing child class behaviour. And if we are calling from parant class object then its 
		showing parant class behaiour 
       */
	}

}
