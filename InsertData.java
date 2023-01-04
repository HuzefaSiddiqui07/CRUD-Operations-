package com.java.mysql.jdbc.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// Insert Data into Database through JDBC (Connection Pool)

public class InsertData {

	Connection con = null;
	PreparedStatement pStmnt = null;

	private void insertData(int id, String fName, String lName) throws SQLException {

		try {
			// Create an Object of ConnectionTest Class
			ConnectionTest ct = new ConnectionTest();

			con = ct.getConnectionDetails();

			// Create the statement
			pStmnt = con.prepareStatement("insert into client(id , firstname , lastname)values(? , ? , ?)");

			pStmnt.setInt(1, id);
			pStmnt.setString(2, fName);
			pStmnt.setString(3, lName);

			// Submit the SQL statement to Database
			int a = pStmnt.executeUpdate();

			// Process the Results
			System.out.println("Insertion Done !" + a);

		} catch (Exception e) {

			System.out.println(e);

		} finally {

			con.close();
			pStmnt.close();

		}

	}

	public static void main(String[] args) throws SQLException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of Data to be Insert");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println("Enter Id");
			int id = scan.nextInt();

			System.out.println("Enter First Name");
			String fName = scan.next();

			System.out.println("Enter Last Name");
			String lName = scan.next();

			// Create an Object of UserInput class
			InsertData insertData = new InsertData();

			insertData.insertData(id, fName, lName);
		}

		scan.close();
	}
}
