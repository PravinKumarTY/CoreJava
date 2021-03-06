package com.dev.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.dev.objectmethods.Dog;

public class EmployeeInterfaceImpl implements EmployeeInterFace{
	Map<Integer,Employee> empMap=new HashMap<Integer, Employee>();
	HashSet<Dog> hs=new HashSet<Dog>();
	//public boolean addEmployee(Dog e) {
		// TODO Auto-generated method stub
		
		/*Employee e1=new Employee();
		e1.setEmpId(1000);
		e1.setAddress("Btm");
		e1.setName("Pravin");
		e1.setAge(30);
		empMap.put(1,e1);	
		
		Employee e2=new Employee();
		e2.setEmpId(1001);
		e2.setAddress("HSR");
		e2.setName("Rohit");
		e2.setAge(35);
		empMap.put(2,e2);*/	
		//return false;
	//}

	@Override
	public boolean addDog(Dog e) {
		if(e!=null) {
			hs.add(e);
			return true;
		}
		return false;
	}

	@Override
	public void getDog() {
		System.out.println(hs);
	}

	@Override
	public boolean remove(Dog d) {
		boolean b=hs.remove(d);
		if(b) {
			return true;
		}
		return false;
	}
}
