package com.faith.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.faith.bean.Student;
import com.faith.dao.InsertDaoTwo;




@WebServlet("/InsertServletTwo")
public class InsertServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// reading values from controls in jsp page
		String stuName = request.getParameter("stuname");
		
		String stuDOB = request.getParameter("birthday");
		java.util.Date dob=null;	
		java.text.DateFormat format=new java.text.SimpleDateFormat("yyyy-MM-dd");
		try {
			dob=format.parse(stuDOB);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String genderName = request.getParameter("gender");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phNo = request.getParameter("phno");
		String qualification = request.getParameter("qual");

		
	
		// creating object for patient bean
		Student objStudent = new Student();
		objStudent.setsName(stuName);
		objStudent.setDob(dob);
		objStudent.setGender(genderName);
		objStudent.setAddress(address);
		objStudent.setEmail(email);
		objStudent.setPhoneNum(phNo);
		objStudent.setQual(qualification);
		System.out.println(objStudent);
	  //Creating object for dao service
     InsertDaoTwo objInsertDao=new InsertDaoTwo();
      
     objInsertDao.insert(objStudent);
		
      response.sendRedirect("InsertedTwo.jsp");
       }
}
