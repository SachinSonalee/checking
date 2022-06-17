package com.app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppServiceImpl implements appservices {

	@Override
	public void login(String name, String password) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/praticeapp","root","8147879545");
			Statement stnmt = con.createStatement();
			ResultSet result = stnmt.executeQuery("select * from login where name='"+name+"' and password = '"+password+"'");
			System.out.println(result.next());
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
