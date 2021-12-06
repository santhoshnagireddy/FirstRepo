package com.nt.ojas;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondApp extends GenericServlet {
	PrintWriter pw=null;
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		pw=res.getWriter();
		 pw.println("<h1 style=color:red;>WELCOME SERVLET SECOND APP </h1>");
		
	}
	

}



