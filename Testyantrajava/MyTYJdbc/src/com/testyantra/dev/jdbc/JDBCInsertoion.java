package com.testyantra.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertoion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			//Load the Driver.
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			//Get Connection Via Driver.
			String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db";
			System.out.println("Enter the Username and Password.");
			String user=sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("Connection Established..");
			System.out.println("************************");
			
			//Issue the Sql query..
			String query="insert into users_info values(?,?,?,?)";
			pstmt=conn.prepareStatement(query);
			
			
			System.out.println("Enter Username...");
			String userName=sc.next();
			
			System.out.println("Enter User Id..");
			int userId=sc.nextInt();
			
			System.out.println("Enter Email....");
			String email=sc.next();
			
			System.out.println("Enter password....");
			String userPassword=sc.next();
			
			pstmt.setString(1,userName);
			pstmt.setInt(2,userId);
			pstmt.setString(3, email);
			pstmt.setString(4,userPassword);
			
			int count=pstmt.executeUpdate();
			//Process the Results 
			if(count>0) {
				System.out.println("Query OK,"+count+" row affcted.");
			}else {
				System.out.println("Something wrong...");
			}
		} catch (Exception e) {
			System.out.println("Something went wrong.");
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
