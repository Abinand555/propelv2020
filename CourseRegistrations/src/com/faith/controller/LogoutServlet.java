package com.faith.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// opening existing session
		HttpSession session = request.getSession(false);

		// check if session is not null
		if (session != null) {

			// removing all session attributes
			session.invalidate();

			// setting value
			request.setAttribute("errMessage",
					"You have logged out successfully");

			// creating object and setting login.jsp page
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/Index.jsp");

			requestDispatcher.forward(request, response);
		}
	}

}
