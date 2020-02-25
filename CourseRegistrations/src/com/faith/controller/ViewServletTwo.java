package com.faith.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.faith.bean.Student;
import com.faith.dao.InsertDao;



@WebServlet("/ViewServletTwo")
public class ViewServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// creating object for AdminDao
		InsertDao objInsertDao = new InsertDao();

		List<Student> listStudent = objInsertDao.displayAll();

		request.setAttribute("listStudentKey", listStudent);

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("ViewStudentTwo.jsp");
		dispatcher.forward(request, response);

	}
}
