package registration.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.EtudiantDao;
import registration.model.Etudiant;


@WebServlet("/EtudiantServlet")
public class EtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public EtudiantServlet() {
        super();
       
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Nom =request.getParameter("Nom");
		String Prenom =request.getParameter("Prenom");
		String Email =request.getParameter("Email");
		String Password =request.getParameter("Password");
		String Contact =request.getParameter("Contact");
		String Address =request.getParameter("Address");
		Etudiant etudiant =new Etudiant();	
		etudiant.setNom(Nom);
		etudiant.setPrenom(Prenom);
		etudiant.setEmail(Email);
		etudiant.setPassword(Password);
		etudiant.setContact(Contact);
		etudiant.setAddress(Address);
		EtudiantDao rDao = new EtudiantDao();
		String result = rDao.registerEtudiant(etudiant);
		response.getWriter().print(result);
		response.sendRedirect("EtudiantDetails.jsp");}

}
