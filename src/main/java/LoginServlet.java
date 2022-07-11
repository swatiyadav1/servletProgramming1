
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet 
{


/**
	 * 
	 */
	private static final long serialVersionUID = -4740080044376374287L;

@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
	
	response.setContentType("text/html");
	String userName = request.getParameter("username");
	String pass= request.getParameter("password");
	
	PrintWriter p = response.getWriter();
	String mesg="username is :"+userName+"<br/> Password is :"+pass ;
	
	
	String message="";
	String values[]=request.getParameterValues("Checkboxgrp");
	
	if(values!=null) {
		for(int i=0;i<values.length;i++) {
			message=message+"<br/>"+values[i];
					
		}
	}
	
	//enumration code for getparameternames
	
 Enumeration<String> pEnum =request.getParameterNames();
 StringBuffer b = new StringBuffer();
 
	while(pEnum.hasMoreElements()) {
		String eName = pEnum.nextElement();
		String prName = request.getParameter(eName);
		b.append(eName + ":" + prName);
		b.append("<br/>");
	}
	
	
	p.println(mesg);
	
	p.println(message);
	
	
	p.println(b.toString());
}
}
 


//getParameter
//getParameterValues
//
//getParameterNames
