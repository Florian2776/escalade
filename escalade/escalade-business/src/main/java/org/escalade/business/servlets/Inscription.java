package org.escalade.business.servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.escalade.model.beans.Utilisateur;
import org.escalade.consumer.dao.*;

/**
 * Inscription implementation class Inscription
 */
@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UtilisateurDao utilisateurDao;

    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.utilisateurDao = daoFactory.getUtilisateurDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("utilisateurs", utilisateurDao.lister());
        }
        catch (DaoException e) {
            request.setAttribute("erreur", e.getMessage());
        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        try {
        	
        	if (request.getParameter("mdp").compareTo(request.getParameter("mdp2")) != 0) {
                throw new ServletException("Les mots de passes ne sont pas identiques");
            }
        	
        	// conversions 
        	String date = request.getParameter("naissance");
        	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        	Date d = sdf.parse(date);
        	int exp = Integer.parseInt(request.getParameter("exp"));
        	
        	// TODO 
        	// gestion des identifiants uniques /!\ 
        	
            Utilisateur utilisateur = new Utilisateur(
            		-1,
            		request.getParameter("pseudo"),
            		request.getParameter("nom"),
            		request.getParameter("prenom"),
            		request.getParameter("email"),
            		request.getParameter("tel"),
            		d,
            		request.getParameter("mdp"),
            		exp,
            		0, 0, 0, 0, true
            		);
            
            utilisateurDao.ajouter(utilisateur);
            request.setAttribute("utilisateurs", utilisateurDao.lister());
        }
        catch (Exception e) {
            request.setAttribute("erreur", e.getMessage());
        }
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
    }
    
    

}