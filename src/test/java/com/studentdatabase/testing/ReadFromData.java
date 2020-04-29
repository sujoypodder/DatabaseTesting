package com.studentdatabase.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadFromData {

	public static void main(String[] args) throws Exception {

		Connection conn = null;
		String dbUrl = "jdbc:mysql://localhost:3306/studentdatabase?useSSL=true";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String password = "root";
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(dbUrl, userName, password);
		System.out.println("successfully connected");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from register");
		while (rs.next()) {
			System.out.println("ID: " + rs.getString("sid") + "--" + "NAME: " + rs.getString("sname") + "--" + "EMAIL: "
					+ rs.getString("semail") + "--" + "PHONE: " + rs.getString("sphone") + "--" + "REGISTRATION DATE: "
					+ rs.getString("regdate"));
		}
		System.out.println("successfully executed");
		rs.close();
	}

}
