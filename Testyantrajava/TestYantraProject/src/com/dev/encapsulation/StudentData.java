package com.dev.encapsulation;

public class StudentData extends Demo{
	

	public static void main(String[] args) {
		Student s=new Student();
		s.setRegno(274847);
		s.setName("Pravin kumar");
		s.setEmail("pravinkumar@gmail.com");
		s.setPassword("1234");
		int regno=s.getRegno();
		System.out.println("Regno.:"+regno);
		System.out.println("Name.:"+s.getName());
		System.out.println("Email.:"+s.getEmail());

	}

}
