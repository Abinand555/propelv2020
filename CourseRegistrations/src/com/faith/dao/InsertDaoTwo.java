package com.faith.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;                         
import com.faith.bean.Student;
import com.faith.helper.ConnectionFactory;

public class InsertDaoTwo {

	// query for inserting patient record into table
	private static String CREATE_STU = "INSERT INTO studenttwo (SNAME,BDAY,GENDER,ADDR,EMAILADDR,PHNO,QUAL,ISACTIVE) VALUES (?,?,?,?,?,?,?,'Y')";

	// query to view all patient details
	private static String VIEW_ALL = "SELECT * FROM studenttwo";
	

	// query to search a patient ID
	

	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet resultSet = null;

	// method to insert patient record to table
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.phrmcy.dao.IPatientDao#insert(com.phrmcy.bean.Patient)
	 */
	public boolean insert(Student objStudent) {

		// local variable
		boolean result = false;

		try {

			// connection
			connection = ConnectionFactory.getConnection();
			// passing query to statement
			statement = connection.prepareStatement(CREATE_STU);
			statement.setString(1, objStudent.getsName());
			statement.setDate(2, new java.sql.Date(objStudent.getDob().getTime()));
			statement.setString(3,objStudent.getGender() );
			statement.setString(4, objStudent.getAddress());
			statement.setString(5, objStudent.getEmail());
			statement.setString(6, objStudent.getPhoneNum());
			statement.setString(7, objStudent.getQual());

			// query execution
			if (1 == statement.executeUpdate()) {
				result = true;
			}

			statement.close();
			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return result;

	}

	// method to view all patient list
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.phrmcy.dao.IPatientDao#displayAll()
	 */
	public List<Student> displayAll() {

		// creating ArrayList
		List<Student> stuList = new ArrayList<Student>();

		try {

			// connection
			connection = ConnectionFactory.getConnection();

			// passing query to statement
			statement = connection.prepareStatement(VIEW_ALL);

			// executing query
			resultSet = statement.executeQuery();

			// reading resultSet
			while (resultSet.next()) {

				
				
				
				// reading each row
				Integer sNo = resultSet.getInt("sid");
				String stuName = resultSet.getString("sname");
				Date dobTwo = resultSet.getDate("bday");
				String gender = resultSet.getString("gender");
				String address = resultSet.getString("addr");
				String emailAddress = resultSet.getString("emailaddr");
				String phone = resultSet.getString("phno");
				String qual = resultSet.getString("qual");
				String isActive = resultSet.getString("isactive");

				// adding data into ArrayList
				stuList.add(new Student(sNo, stuName, dobTwo, gender, address, emailAddress, phone,qual, isActive));

			}System.out.println(stuList);

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
		return stuList;
	}

	
	}

	

