package demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServletExample
 */
@WebServlet("/FirstServletExample")
public class FirstServletExample extends HttpServlet implements jakarta.servlet.Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServletExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("<!DOCTYPE html>");
		out.write("<head>");
		out.write("<title>Servlet Demo</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("<h1>This is our first Servlet Program</h1>");
		out.write("<h3>Trying servlet with tomcat</h3>");
		out.write("</body>");
		out.write("</html>");
	}

}
