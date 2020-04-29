package com.studentdatabase.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {

	public static void main(String[] args) throws Exception {

		Connection conn = null;
		String dbUrl = "jdbc:mysql://localhost:3306/studentdatabase?useSSL=true";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String password = "root";
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(dbUrl, userName, password);
		System.out.println("successfully connected");
		PreparedStatement ps = conn.prepareStatement(
				"INSERT into register(sid,sname,semail,sphone,regdate)VALUES('006','billu','billu123email.com',77894123,'2015-05-02')");
		ps.executeUpdate();
		System.out.println("successfully updated");
		conn.close();

	}

}
