package firstWeb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("User name= "+request.getParameter("name") +" Password= "+request.getParameter("pass"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * TODO if name and password is wrong show the login page again with message
	 * if name is less than 4 chars then add msg and login page
	 * if pass is less than 8 chars then add msg and login page
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
//		if("root".equals(name) && "root".equals(pass)) {
//			request.setAttribute("message", "Hii root....how have you been");
//		}else {
//			request.setAttribute("message","Only root is a valid user");
//			
//		}
		
/**if name and password is wrong show the login page again with message*/
		
		 if ("validUsername".equals(name) && "validPassword".equals(pass)) {
	            // Redirect to a success page
	            response.sendRedirect("success.jsp");

	        } else {
	            // Set an error message and forward back to the login page
	            request.setAttribute("errorMessage", "Invalid username or password");
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        }
	    }
		

	
	
	}

