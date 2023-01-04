package com.java.mysql.jdbc.crudoperations;

/* Design the user table that contain id, first name, last name, city and mobile number. 
perform the CRUD operation using JDBC. */

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

	Connection con = null;

	// Create a Connection Return Type Method
	public Connection getConnectionDetails() {

		try {

			// Load the Driver Class
			Class.forName("com.mysql.jdbc.Driver");

			// Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "root");

		} catch (Exception e) {

			System.out.println(e);
		}

		return con;

	}

}
