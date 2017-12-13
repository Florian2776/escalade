package org.escalade.app.beans;

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
        id = null;
        nom = null;
        hauteur = 0;
        cotation = null;
        nbPoints = 0;
        nbLongueurs = 0;
        nbRelais = 0;
    }

    public Voie(int id, String nom, int hauteur, String cotation,
                int nbPoints, int nbLongueurs, int nbRelais) {
        this.id = id;
        this.nom = nom;
        this.hauteur = hauteur;
        this.cotation = cotation;
        this.nbPoints = nbPoints;
        this.nbLongueurs = nbLongueurs;
        this.nbRelais = nbRelais;
    }

    // getter and voie
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
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

    public void setCotation(String cotation) {
        this.cotation = cotation;
    }

    public int getNbPoints() {
        return hauteur;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public int getNbPoints() {
        return hauteur;
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