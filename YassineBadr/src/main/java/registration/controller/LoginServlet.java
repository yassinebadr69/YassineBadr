package registration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.EtudiantDao;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

	     String username = request.getParameter("Username");
	        String password = request.getParameter("Password");
	        
	        EtudiantDao lDao = new EtudiantDao();
	        
			if(lDao.check(username,password))
			{
				response.sendRedirect("Acceuil.jsp");
			}
			else
			{
				response.sendRedirect("Login.jsp");
			}
	
	}

}
