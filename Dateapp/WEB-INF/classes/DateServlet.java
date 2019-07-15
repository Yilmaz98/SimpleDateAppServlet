//DateServlet.java
package com.yil.servlet;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class DateServlet extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw= null;
		Date date = null;
		res.setContentType("text/html");
		pw = res.getWriter();
		date = new Date();
		pw.println("<h1 style='align:center'>Date and Time::"+date+"</h1>");
		pw.close();
	}
}


//class must be public , loadable and instantiable by Servlet container