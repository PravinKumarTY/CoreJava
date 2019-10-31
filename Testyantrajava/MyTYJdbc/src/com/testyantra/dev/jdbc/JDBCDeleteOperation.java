package com.testyantra.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDeleteOperation {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Connection conn=null;
      PreparedStatement pstmt=null;
      try {
    	  //Load the Driver
    	  Class.forName("com.mysql.jdbc.Driver");
    	  System.out.println("Driver Loaded..");
    	  //Get the Db Connection.
    	  String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db";
    	  
    	  String filePath="C:\\Users\\admin\\Desktop\\db.properties";
    	  FileReader reader=new FileReader(filePath);
    	  Properties prop=new Properties();
    	  prop.load(reader);
    	  conn=DriverManager.getConnection(dbUrl,prop);
    	  System.out.println("Connection estd..");
    	  
    	  //Issue sql query
    	  String query="delete from users_info where userid=? and password=?";
    	  pstmt=conn.prepareStatement(query);
    	  System.out.println("Enter UserId...");
    	  pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
    	  System.out.println("Enter Password");
    	  pstmt.setString(2,sc.nextLine());
    	  
    	  int count=pstmt.executeUpdate();
    	  
    	  //Process the result.
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
