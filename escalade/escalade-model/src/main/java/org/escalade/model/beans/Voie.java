package org.escalade.model.beans;

public class Voie {
    // attributs
    private int id;
    private String nom;
    private int hauteur;
    private String cotation;
    private int nbPoints;
    private int nbLongueurs;
    private int nbRelais;

    // constructeurs
    public Voie() {
        id = 0;
        nom = null;
        hauteur = 0;
        cotation = null;
        nbPoints = 0;
        nbLongueurs = 0;
        nbRelais = 0;
    }

    public Voie(int id, String nom, int hauteur, String cotation,
                int nbPoints, int nbLongueurs, int nbRelais) throws BeanException {
        if (id == 0) {
            throw new BeanException("Identifiant de la voie incorect.");
        }
        this.id = id;
        if (nom == null || nom.compareTo("") == 0){
            throw new BeanException("Nom de la voie incorrect.");
        }
        this.nom = nom;
        this.hauteur = hauteur;
        if (cotation == null || cotation.compareTo("") == 0){
            throw new BeanException("Cotation de la voie incorrect.");
        }
        this.cotation = cotation;
        this.nbPoints = nbPoints;
        this.nbLongueurs = nbLongueurs;
        this.nbRelais = nbRelais;
    }

    // getter and voie
    public int getId() {
        return id;
    }

    public void setId(int id) throws BeanException {
        if (id == 0) {
            throw new BeanException("Identifiant de la voie incorect.");
        }
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws BeanException {
        if (nom == null || nom.compareTo("") == 0){
            throw new BeanException("Nom de la voie incorrect.");
        }
        this.nom = nom;
    }

    public int gethauteur() {
        return hauteur;
    }

    public void sethauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public String getCotation() {
        return cotation;
    }

    public void setCotation(String cotation) throws BeanException {
        if (cotation == null || cotation.compareTo("") == 0){
            throw new BeanException("Cotation de la voie incorrect.");
        }
        this.cotation = cotation;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public int getNbLongueurs() {
    	return nbLongueurs;
    }
    
    public void setNbLongueurs(int nbLongueurs) {
        this.nbLongueurs = nbLongueurs;
    }

    public int getNbRelais() {
        return nbRelais;
    }

    public void setNbRelais(int nbRelais) {
        this.nbRelais = nbRelais;
    }
}