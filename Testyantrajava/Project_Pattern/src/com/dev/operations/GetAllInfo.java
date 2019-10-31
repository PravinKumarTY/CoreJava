package com.dev.operations;

import com.dev.beans.User;
import com.dev.services.UserServiceImpl;
import com.dev.services.UserServices;

public class GetAllInfo {

	public static void main(String[] args) {
          UserServices us=new UserServiceImpl();
          User user=us.getAllInfo();
          System.out.println("User Id...:"+user.getUsername());
          System.out.println("User name..:"+user.getUsername());
          System.out.println("Email...:"+user.getEmail());
          
	}
}
