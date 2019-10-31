package com.dev.collections;

import java.net.StandardSocketOptions;
import java.util.Iterator;
import java.util.TreeSet;

import com.dev.objectmethods.Dog;

public class C3 {

	public static void main(String[] args) {
		TreeSet<Employee> ts=new TreeSet<Employee>();
		Employee e1=new Employee();
		e1.setAge(30);
		e1.setName("Rohit");
		e1.setEmpId(1000);	
		e1.setAddress("Btm");
		
		Employee e2=new Employee();
		e2.setAge(50);
		e2.setName("Chacha");
		e2.setEmpId(1001);	
		e2.setAddress("Basavangudi");
		
		Employee e3=new Employee();
		e1.setAge(33);
		e1.setName("Pravin");
		e1.setEmpId(1002);	
		e1.setAddress("Btm");
		
		Employee e4=new Employee();
		e4.setAge(35);
		e4.setName("Mahendra");
		e4.setEmpId(1003);	
		e4.setAddress("Rajajinagar");
		
		Employee e5=new Employee();
		e5.setAge(30);
		e5.setName("Manish");
		e5.setEmpId(1005);	
		e5.setAddress("Btm");
		
		Employee e6=new Employee();
		e6.setAge(100);
		e6.setName("Nilesh");
		e6.setEmpId(1006);	
		e6.setAddress("Btm");
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        ts.add(e6);
        for(Employee e:ts) {
        	System.out.println("Id.:"+e.getEmpId());
        	System.out.println("Name..:"+e.getName());
        	System.out.println("Age.:"+e.getAge());
        	System.out.println("Address.:"+e.getAddress());
        }
	}

}
