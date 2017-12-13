package org.escalade.app.beans;

public class Site {
    // attributs
    private int id;
    private String nom;
    private int nbSecteurs;
    private List<Secteur> secteur;

    // constructeurs
    public Site() {
        id = null;
        nom = null;
        nbSecteurs = 0;
        secteur = null;
    }

    public Site(int id, String nom, int nbSecteurs, List<Secteur> secteur) {
        this.id = id;
        this.nom = nom;
        this.nbSecteurs = nbSecteurs;
        this.secteur = secteur;
    }

    // getter and secteur
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

    public int getNbSecteurs() {
        return nbSecteurs;
    }

    public void setNbSecteurs(int nbSecteurs) {
        this.nbSecteurs = nbSecteurs;
    }

    public List<Secteur> getSecteur() {
        return secteur;
    }

    public void setSecteur(List<Secteur> secteur) {
        this.secteur = secteur;
    }
}