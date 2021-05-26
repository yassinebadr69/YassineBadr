package registration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.EtudiantDao;
import registration.model.Livre;


@WebServlet("/AjouterLivreServlet")
public class AjouterLivreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AjouterLivreServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

	     	String Categorie = request.getParameter("Categorie");
	     	String Nom = request.getParameter("Nom");
	     	String Auteur = request.getParameter("Auteur");
	     	
	     	Livre livre=new Livre();
	        
	     	
	     	livre.setCategorie(Categorie);
			livre.setNom(Nom);
			livre.setAuteur(Auteur);
			
			EtudiantDao rDao = new EtudiantDao();
			String result = rDao.AjouterLivre(livre);
			response.getWriter().print(result);   
			response.sendRedirect("AjouterLivre1.jsp");
	        
	
	}

}
