package com.dev.collections;

import com.dev.objectmethods.Dog;

public class EmployeeMainClass {

	public static void main(String[] args) {
		EmployeeInterfaceImpl ei=new EmployeeInterfaceImpl();
		Dog d=new Dog();
		d.setAge(1);
		d.setBreed("Zarman");
		d.setColor("Black");
		d.setName("Tommy");
		
		Dog d1=new Dog();
		d1.setAge(1);
		d1.setBreed("hjhf");
		d1.setColor("white");
		d1.setName("harray");
		
		boolean b=ei.addDog(d);
		boolean b1=ei.addDog(d1);
		System.out.println(b);
		System.out.println(b1);
		ei.getDog();
		boolean romveddog=ei.remove(d);
		System.out.println(romveddog);
		
	}
}
