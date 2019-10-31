package com.testyantra.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class JDBCSingleRetrival {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//Load The Driver.
			Class.forName("com.mysql.jdbc.Driver");
			//Get the Db Connection.
			String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db";
			String filePath="C:\\Users\\admin\\Desktop\\db.properties";
			FileReader reader=new FileReader(filePath);
			Properties prop=new Properties();
			prop.load(reader);
			
			conn=DriverManager.getConnection(dbUrl,prop);
			
			//Issue Sql query.
			String query="select * from users_info where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("Enter UserId..");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Password..");
			pstmt.setString(2,sc.nextLine());
			
			rs=pstmt.executeQuery();
			
			//Process the Result.
			while (rs.next()) {
				String name=rs.getString("username");
				int userId=rs.getInt("userid");
				String email=rs.getString("email");
				System.out.println("Name..:"+name+", User Id..:"+userId+" and Email..:"+email);
			}
			
		} catch (Exception e) {
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
			}if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			sc.close();
		}
	}
}
