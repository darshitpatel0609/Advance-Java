package com.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupController extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("SignUpController Called");
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		System.out.println("firstName is"+firstName);
		System.out.println("lastName is"+lastName);
		System.out.println("email is"+email);
		System.out.println("password is"+password);
		
	}

}
