package com.faith.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.faith.bean.Login;
import com.faith.dao.LoginDao;




@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// reading values from controls in jsp page
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		// creating object for LoginDao
		LoginDao loginDao = new LoginDao();

		// calling method to search
		Login login = loginDao.loginVerify(userName, password);

		// check if record found or not
		if (login != null) {
			
			// getting rolename by passing roleid
			String fullName = login.getFullName();
			// role as admin
			if (login.getLoginId()==2) {
			//if (roleName.equalsIgnoreCase("admin")) {
				// creating session
				HttpSession session = request.getSession();
				// setting value into session
				session.setAttribute("name", fullName);

				// calling admin page
				request.getRequestDispatcher("/welcome.jsp").forward(request,
						response);

			}
			
		} else {
			// no record found
			request.setAttribute("errMessage", "Invalid Username and Password");
			request.getRequestDispatcher("/Index.jsp").forward(request,
					response);
		}
	}

}
