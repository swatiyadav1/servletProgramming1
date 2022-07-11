
import java.io.IOException;
import java.io.PrintWriter;
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
	
	p.println(mesg);
	
}
}
 


//getParameter
//getParameterValues
//
//getParameterNames
