package com.testyantra.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class JdbcUpdateOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		
		try {
			//Load the Driver..
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded.");
			//Get the Db Connection..
			String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db";
			conn=DriverManager.getConnection(dbUrl,"root","root");
			System.out.println("Contion Estd..");
			//Issue SQL query.
			
			String query="update users_info set email=? where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			
			System.out.println("Enter Email Id");
			pstmt.setString(1, sc.nextLine());
			
			System.out.println("Enter User Id");
			pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
			
			System.out.println("Enter Password..");
			pstmt.setString(3,sc.nextLine());
			
			int count=pstmt.executeUpdate();
			//Proccess the result.
			if(count>0) {
				System.out.println("Query OK,"+count+"row affcted");
			}else {
				System.out.println("Something went wrong.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			sc.close();
		}

	}

}
