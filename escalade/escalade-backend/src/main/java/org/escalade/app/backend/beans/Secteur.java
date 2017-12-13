package org.escalade.app.beans;

public class voie {
    // attributs
    private int id;
    private String nom;
    private int nbVoies;
    private List<Voie> voie;

    // constructeurs
    public Secteur() {
        id = null;
        nom = null;
        nbVoies = 0;
        voie = null;
    }

    public Secteur(int id, String nom, int nbVoies, List<Voie> voie) {
        this.id = id;
        this.nom = nom;
        this.nbVoies = nbVoies;
        this.voie = voie;
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

    public int getnbVoies() {
        return nbVoies;
    }

    public void setnbVoies(int nbVoies) {
        this.nbVoies = nbVoies;
    }

    public List<Voie> getvoie() {
        return voie;
    }

    public void setvoie(List<Voie> voie) {
        this.voie = voie;
    }
}