package com.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    private static Connection conn;

    public static Connection getConnection() {
		// set connection mysql
		String URL = "jdbc:mysql://localhost:3306/dbsiswa";
		String USER = "root";
		String PWD = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PWD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
}
