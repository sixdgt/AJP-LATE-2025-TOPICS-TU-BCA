package demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/Contact")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// RequestDispatcher will help to dispatch the request to the particular page we pointed
		RequestDispatcher rd = request.getRequestDispatcher("contact_form.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// to get data from request method i.e POST
		String full_name = request.getParameter("full_name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String remarks = request.getParameter("remarks");
		System.out.println(full_name);
		System.out.println(email);
		System.out.println(remarks);
		System.out.println(contact);
		// to send data to another page
		request.setAttribute("full_name", full_name);
		request.setAttribute("contact", contact);
		request.setAttribute("email", email);
		request.setAttribute("remarks", remarks);
		request.getRequestDispatcher("form_result.jsp").forward(request, response);
	}

}
