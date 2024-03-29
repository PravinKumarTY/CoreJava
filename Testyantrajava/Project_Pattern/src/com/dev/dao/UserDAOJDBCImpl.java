package com.dev.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.dev.beans.User;

public class UserDAOJDBCImpl implements UserInfoDAO{
	
	public UserDAOJDBCImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static final String DBURL="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	Scanner sc=new Scanner(System.in);
	@Override
	public List<User> getAllInfo() {
		String query="select * from users_info";
		List<User> userList=new ArrayList<User>();
		
		try(Connection conn=DriverManager.getConnection(DBURL);
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query)){
			while (rs.next()) {
			   User user=new User();
			   user.setUserid(rs.getInt("userid"));	
			   user.setUsername(rs.getString("username"));
			   user.setEmail(rs.getString("email"));
			   user.setPasswd(rs.getString("password"));
			   userList.add(user);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return userList;
	}

	@Override
	public void createProfile(User user) {
		String query="insert into users_info values(?,?,?,?)";
		
		try(Connection conn=DriverManager.getConnection(DBURL);
			PreparedStatement pstmt=conn.prepareStatement(query)){
			
			pstmt.setString(1,user.getUsername());
			pstmt.setInt(2,user.getUserid());
			pstmt.setString(3,user.getEmail());
			pstmt.setString(4,user.getPasswd());
			
			int i= pstmt.executeUpdate();
			if(i>0) {
				System.out.println("Profile Created.");
			}else {
				System.out.println("Failed to create profile..");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
