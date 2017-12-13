package org.escalade.app.beans;

public class Articles throws BeanException {
    // attributs
    private int id;
    private String titre;
    private String auteur;
    private Date date;
    private String contenu;
    private List<Commentaires> commentaires;

    // constructeurs
    public Articles() {
        this.id = null;
        this.titre = null;
        this.auteur = null;
        this.date = null;
        this.contenu = null;
        this.commentaires = null;
    }

    public Articles(int id, String titre, String auteur, Date date,
                    String contenu,List<Commentaires> commentaires) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.date = date;
        this.contenu = contenu;
        this.commentaires = commetaires;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id == null){
            throw new BeanException("Idenifiant de l'article incorrect.");
        }
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        if (titre == null || titre.compareTo("") == 0){
            throw new BeanException("Titre de l'article incorrect.");
        }
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        if (auteur == null || auteur.compareTo("") == 0){
            throw new BeanException("Auteur/Pseudo de l'article incorrect.");
        }
        this.auteur = auteur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        if (contenu == null || contenu.compareTo("") == 0){
        throw new BeanException("Contenu de l'article incorrect.");
        }
        this.contenu = contenu;
    }

    public List<Commentaires> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaires> commentaires) {
        this.commentaires = commentaires;
    }

    // Outils

}