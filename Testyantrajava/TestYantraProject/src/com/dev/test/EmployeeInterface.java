package com.dev.test;

public interface EmployeeInterface {
	public boolean addEmployee(Employee e);
	public void showEmpList();
	public void displayEmployee(int empId);
	public boolean removeEmployee(int empId);
	public boolean updateEmployee(int empId,Employee e);
	public double totalTax(int empId);
}
