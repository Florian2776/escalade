package org.escalade.app.beans;

public class Commentaires {
    // attributs
    private int id;
    private String auteur;
    private Date date;
    private String message;

    // constructeurs
    public Commentaires() {
        this.id = null;
        this.auteur = null;
        this.date = null;
        this.message = null;
    }

    public Articles(int id, String auteur, Date date, String message) {
        this.id = id;
        this.auteur = auteur;
        this.date = date;
        this.message = message;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id == null){
            throw new BeanException("Idenifiant du commentaire incorrect.");
        }
        this.id = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        if (auteur == null || auteur.compareTo("") == 0){
            throw new BeanException("Auteur/Pseudo du commentaire incorrect.");
        }
        this.auteur = auteur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return contenu;
    }

    public void setMessage(String message) {
        if (message == null || message.compareTo("") == 0){
            throw new BeanException("Message du commentaire incorrect.");
        }
        this.message = message;
    }

    // Outils

}