package org.escalade.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.escalade.app.backend.beans.Utilisateur;
import org.escalade.app.backend.dao.*;

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
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setPseudo(request.getParameter("pseudo"));
            utilisateur.setNom(request.getParameter("nom"));
            utilisateur.setPrenom(request.getParameter("prenom"));
            if (request.getParameter("mdp").compareTo(request.getParameter("mdp2")) != 0) {
                throw new ServletException("Les mots de passes ne sont pas identiques");
            }
            utilisateur.setPassword(request.getParameter("mdp"));
            utilisateur.setExperience(request.getParameter("exp"));
            utilisateur.setEmail(request.getParameter("email"));
            utilisateur.setTel(request.getParameter("tel"));

            utilisateurDao.ajouter(utilisateur);
            request.setAttribute("utilisateurs", utilisateurDao.lister());
        }
        catch (Exception e) {
            request.setAttribute("erreur", e.getMessage());
        }
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
    }
    
    

}