package com.dev.operations;

import java.util.Scanner;

import com.dev.beans.User;
import com.dev.services.UserServiceImpl;
import com.dev.services.UserServices;

public class CreateProfile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserServices us=new UserServiceImpl();
		User user=new User();
		System.out.println("Enter User Id.");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter UserName..");
		user.setUsername(sc.nextLine());
		System.out.println("Enter Email..");
		user.setEmail(sc.nextLine());
		System.out.println("Enter Password..");
		user.setPasswd(sc.nextLine());
		us.createProfile(user);
	}

}
