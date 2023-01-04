package com.java.mysql.jdbc.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveData {

	public static void main(String[] args) {

		try {

			ConnectionTest cTest = new ConnectionTest();

			Connection con = cTest.getConnectionDetails();

			// Create the statement
			PreparedStatement pStmnt = con.prepareStatement("select * from client");

			// Submit the SQL statement to Database
			ResultSet rs = pStmnt.executeQuery();

			while (rs.next()) {
				System.out.println("Id >>> " + rs.getInt(1));
				System.out.println("First Name >>> " + rs.getString(2));
				System.out.println("Last Name >>> " + rs.getString(3));

			}

			// Release Or Close the Resources
			con.close();
			pStmnt.close();

		} catch (Exception e) {

			System.out.println(e);
		}
	}
}
