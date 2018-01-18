package org.escalade.model.beans;

import java.util.*;


public class Commentaires {
    // attributs
    private int id;
    private String auteur;
    private Date date;
    private String message;

    // constructeurs
    public Commentaires() {
        this.id = 0;
        this.auteur = null;
        this.date = null;
        this.message = null;
    }

    public Commentaires(int id, String auteur, Date date, String message)
                    throws BeanException {
        if (id == 0){
            throw new BeanException("Identifiant du commentaire incorrect.");
        }
        this.id = id;
        if (auteur == null || auteur.compareTo("") == 0){
            throw new BeanException("Auteur/Pseudo du commentaire incorrect.");
        }
        this.auteur = auteur;
        if (date == null){
            throw new BeanException("Date du commentaire incorrect.");
        }
        this.date = date;
        if (message == null || message.compareTo("") == 0){
            throw new BeanException("Message du commentaire incorrect.");
        }
        this.message = message;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) throws BeanException {
        if (id == 0) {
            throw new BeanException("Identifiant du commentaire incorrect.");
        }
        this.id = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) throws BeanException {
        if (auteur == null || auteur.compareTo("") == 0){
            throw new BeanException("Auteur/Pseudo du commentaire incorrect.");
        }
        this.auteur = auteur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws BeanException {
        if (date == null){
            throw new BeanException("Date du commentaire incorrect.");
        }
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws BeanException {
        if (message == null || message.compareTo("") == 0){
            throw new BeanException("Message du commentaire incorrect.");
        }
        this.message = message;
    }

}