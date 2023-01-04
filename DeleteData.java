package com.java.mysql.jdbc.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteData {

	public static void main(String[] args) {

		try {

			ConnectionTest cTest = new ConnectionTest();

			Connection con = cTest.getConnectionDetails();

			// Create the statement
			PreparedStatement pStmnt = con.prepareStatement("delete from client where id=?");
			pStmnt.setInt(1, 5); // Delete Complete Row From Database

			// Submit the SQL statement to Database
			int i = pStmnt.executeUpdate();

			// Process the Results
			System.out.println("Delete Record Successfully..." + i);

			// Release Or Close the Resources
			con.close();
			pStmnt.close();

		} catch (Exception e) {

			System.out.println(e);
		}

	}

}
