package org.escalade.app.backend.beans;

import java.util.*;
import org.escalade.app.backend.beans.*;

public class Articles {
    // attributs
	private int id;
    private String titre;
    private String auteur;
    private Date date;
    private String contenu;
    private List<Commentaires> commentaires;

    // constructeurs
    public Articles() {
        this.id = 0;
        this.titre = null;
        this.auteur = null;
        this.date = null;
        this.contenu = null;
        this.commentaires = null;
    }

    public Articles(int id, String titre, String auteur, Date date,
                    String contenu,List<Commentaires> commentaires)
                    throws BeanException {
        if (id == 0){
            throw new BeanException("Identifiant de l'article incorrect.");
        }
        this.id = id;
        if (titre == null || titre.compareTo("") == 0){
            throw new BeanException("Titre de l'article incorrect.");
        }
        this.titre = titre;
            if (auteur == null || auteur.compareTo("") == 0){
            throw new BeanException("Auteur/Pseudo du commentaire incorrect.");
        }
        this.auteur = auteur;
        if (date == null){
            throw new BeanException("Date de l'article incorrect.");
        }
        this.date = date;
        if (contenu == null || contenu.compareTo("") == 0){
            throw new BeanException("Contenu de l'article incorrect.");
        }
        this.contenu = contenu;
        if (commentaires == null){
            throw new BeanException("Commentaires de l'article incorrect.");
        }
        this.commentaires = commentaires;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) throws BeanException {
        if (id == 0){
            throw new BeanException("Identifiant de l'article incorrect.");
        }
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) throws BeanException {
        if (titre == null || titre.compareTo("") == 0){
            throw new BeanException("Titre de l'article incorrect.");
        }
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) throws BeanException {
        if (auteur == null || auteur.compareTo("") == 0){
            throw new BeanException("Auteur/Pseudo de l'article incorrect.");
        }
        this.auteur = auteur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws BeanException {
        if (date == null){
            throw new BeanException("Date de l'article incorrect.");
        }
        this.date = date;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) throws BeanException {
        if (contenu == null || contenu.compareTo("") == 0){
            throw new BeanException("Contenu de l'article incorrect.");
        }
        this.contenu = contenu;
    }

    public List<Commentaires> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaires> commentaires) throws BeanException {
        if (commentaires == null){
            throw new BeanException("Commentaires de l'article incorrect.");
        }
        this.commentaires = commentaires;
    }

    // Outils

}