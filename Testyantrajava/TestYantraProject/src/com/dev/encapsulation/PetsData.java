package com.dev.encapsulation;

public class PetsData {

	public static void main(String[] args) {
		Pets p1=new Pets();
		Pets p2=new Pets();
		Pets p3=new Pets();
		
		p1.setAge(2);
		p1.setType("Dog");
		p1.setBreed("Dober Man");
		p1.setColor("White");
		p1.setName("tommy");
		
		p2.setAge(3);
		p2.setType("Rabit");
		p2.setBreed("gdhsh");
		p2.setName("shiro");
		p2.setColor("Black");
		
		p3.setAge(4);
		p3.setType("Cat");
		p3.setBreed("jhdhfj");
		p3.setName("ljkgk");
		p3.setColor("ljlfdjlja");
		
		Pets[] pets= {p1,p2,p3};
		for(int i=0; i<pets.length; i++) {
			System.out.println("Age.:"+pets[i].getAge());
			System.out.println("Type.:"+pets[i].getType());
			System.out.println("Name.:"+pets[i].getName());
			System.out.println("Color.:"+pets[i].getColor());
			System.out.println("Breed.:"+pets[i].getBreed());
			System.out.println("*************");
		}

	}

}
