package com.java.mysql.jdbc.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateData {

	public static void main(String[] args) {

		try {

			ConnectionTest cTest = new ConnectionTest();

			Connection connection = cTest.getConnectionDetails();

			PreparedStatement pStatement1 = connection.prepareStatement("update client set lastname=? where id=?");

			pStatement1.setString(1, "Mule");
			pStatement1.setString(2, "3");

			PreparedStatement pStatement2 = connection.prepareStatement("update client set lastname=? where id=?");

			pStatement2.setString(1, "Shirsath");
			pStatement2.setString(2, "4");

			int a = pStatement1.executeUpdate();
			int b = pStatement2.executeUpdate();

			System.out.println("Last Name is Updated Successfully..." + a);
			System.out.println("Last Name is Updated Successfully..." + b);

			connection.close();
			pStatement1.close();
			pStatement2.close();

		} catch (Exception e) {

			System.out.println(e);
		}

	}

}
