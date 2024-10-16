package com.javajungle.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test1 {

	public static void main(String[] args) {
		try {
		//load the driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("driver class loaded");
		//establish the connection 
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch5pm","root","root");
	
		System.out.println("i got the connection");
		
		//create the object for Statement 
		
		Statement statement = connection.createStatement();
		
		
		//int x = statement.executeUpdate("insert into student values(103,'sailu')");
		
		//int x = statement.executeUpdate("update student set stname='ram' where stid=102");
		
		// int x = statement.executeUpdate("delete from student where stid=104");
		
		ResultSet resultSet  = statement.executeQuery("select * from student");
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
		}
		
		
		
		//close the connection 
		connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
