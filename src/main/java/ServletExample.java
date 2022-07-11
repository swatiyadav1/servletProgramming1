import java.io.*;
import javax.servlet.*;


public class ServletExample implements Servlet {

	ServletConfig config= null;
	
	
	public void init(ServletConfig config) {
		this.config=config;
		System.out.println("servlet initliase");
		}
	
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException {
		
		res.setContentType("text/html");
		
		PrintWriter p = res.getWriter();
		p.write("<html><body>");
		p.write("<h1>this is a sample servlet</h1>");
		p.write("</body></html>");		
		
		
	}
	
	
	public ServletConfig getServletConfig() {
		return config;
	}
	public String getServletInfo() {
		return "new servlet";
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("servlet destoyed");
		
	}
}
