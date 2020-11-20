package com.revature.serv;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{

	private static final long serialVersionUID = -2470023273352139681L;
		@Override
		public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
			System.out.println("Ya got me!");
		}

}
