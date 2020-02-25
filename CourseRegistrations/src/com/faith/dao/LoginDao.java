package com.faith.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.faith.bean.Login;

import com.faith.helper.ConnectionFactory;



public class LoginDao {

	// query for selecting details based on username and password
	private static String LOGIN_VERIFY = "SELECT * FROM logintabletwo WHERE username=? AND password=? AND isactive='Y'";
	// query for retrieving rolename from roletable
	

	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet resultSet = null;

	public Login loginVerify (String userName, String password) {

		// creating object for Login Class
		Login objLogin = null;

		try {

			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(LOGIN_VERIFY);
			statement.setString(1, userName);
			statement.setString(2, password);

			// executing query
			resultSet = statement.executeQuery();

			// reading data from resultSet
			if (resultSet.next()) {

				// reading all data
				int logId = resultSet.getInt("logid");
				String uname = resultSet.getString("username");
				String pass = resultSet.getString("password");
				int roleId = resultSet.getInt("roleid");
				String fullName = resultSet.getString("fullname");
				String isActive = resultSet.getString("isactive");
				// passing values to parameterized constructor of Login
				objLogin = new Login(logId, uname, pass, roleId, fullName,
						isActive);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		return objLogin;
	}

	
}
