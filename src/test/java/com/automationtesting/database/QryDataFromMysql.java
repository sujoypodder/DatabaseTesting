package com.automationtesting.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QryDataFromMysql {

	public static void main(String[] args) throws Exception {

		Connection conn = null;
		String dbUrl = "jdbc:mysql://localhost:3306/automationtesting?useSSL=true";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String password = "root";
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(dbUrl, userName, password);
		System.out.println("successfully connected");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from creadentials");
		while (rs.next()) {
			System.out.println("Usernames: " + rs.getString("userName") + "--" + "Password: " + rs.getString("password")
					+ "--" + "DateCreated: " + rs.getString("datecreated") + "--" + "NoOfAttemps: "
					+ rs.getString("noofattemps") + "--" + "Results: " + rs.getString("result"));
		}
		System.out.println("successfully executed");
		rs.close();
	}

}
