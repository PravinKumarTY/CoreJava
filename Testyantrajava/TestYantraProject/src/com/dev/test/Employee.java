package com.dev.test;

public class Employee {
	private int empId;
	private String ename;
	private String email;
	private String password;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", email=" + email + ", password=" + password
				+ ", salary=" + salary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private double salary;
}
