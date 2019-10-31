package com.dev.test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeInterfaceImpl implements EmployeeInterface {
	Map<Integer,Employee> empMap=new HashMap<Integer,Employee>();
	@Override
	public boolean addEmployee(Employee e) {
		if(empMap.containsKey(e.getEmpId())) {
			return false;
		}else {
		  empMap.put(e.getEmpId(),e);
		  return true;
		}
	}
	@Override
	public void displayEmployee(int empId) {
		if(empMap.containsKey(empId)) {
			Employee e=empMap.get(empId);
			System.out.println("Employee Name"+e.getEname());
			System.out.println("Employee Id.:"+e.getSalary());
			System.out.println("Employee email.:"+e.getEmail());
			System.out.println("Employee Salary.:"+e.getSalary());
		}else {
			System.out.println("Employee not found.");
		}
	}
	@Override
	public boolean removeEmployee(int empId) {
		if(empMap.containsKey(empId)) {
			empMap.remove(empId);
			return true;
		}else {
			return false;
		}
	}
	@Override
	public boolean updateEmployee(int empId,Employee e) {
		if(empMap.containsKey(empId)) {
			empMap.put(empId,e);
			return true;
		}else {
			return false;
		}
	}
	@Override
	public void showEmpList() {
		System.out.println("All employees..:"+empMap);	
	}
	@Override
	public double totalTax(int empId) {
		double totalTax=0.0;
		if(empMap.containsKey(empId)) {
			Employee e=empMap.get(empId);
			double salary=e.getSalary();
			totalTax=(salary*12*30)/100;
		}
		return totalTax;
	}	
}
