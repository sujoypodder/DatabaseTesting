package com.automationtesting.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDataToMysql {

	public static void main(String[] args) throws Exception {

		Connection conn = null;
		String dbUrl = "jdbc:mysql://localhost:3306/automationtesting?useSSL=true";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String password = "root";
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(dbUrl, userName, password);
		System.out.println("successfully connected");
		PreparedStatement ps = conn.prepareStatement(
				"INSERT into creadentials(userName,password,datecreated,noofattemps,result)VALUES('demouser','pass123','2020-09-01',7,'pass')");
		ps.executeUpdate();
		System.out.println("successfully updated");
		conn.close();

	}

}
