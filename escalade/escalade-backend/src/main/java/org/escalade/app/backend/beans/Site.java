package org.escalade.app.beans;

public class Site {
    // attributs
    private int id;
    private String nom;
    private int nbSecteurs;
    private List<Secteur> secteur;

    // constructeurs
    public Site() {
        id = 0;
        nom = null;
        nbSecteurs = 0;
        secteur = null;
    }

    public Site(int id, String nom, int nbSecteurs, List<Secteur> secteur)
            throws BeanException {
        if (id == 0){
            throw new BeanException("Identifiant du site incorrect.");
        }
        this.id = id;
        if (nom == null || nom.compareTo("") == 0){
            throw new BeanException("Nom du site incorrect.");
        }
        this.nom = nom;
        this.nbSecteurs = nbSecteurs;
        if (secteur == null){
            throw new BeanException("Secteur du site incorrect.");
        }
        this.secteur = secteur;
    }

    // getter and secteur
    public int getId() {
        return id;
    }

    public void setId(int id) throws BeanException {
        if (id == 0){
            throw new BeanException("Identifiant du site incorrect.");
        }
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws BeanException {
        if (nom == null || nom.compareTo("") == 0){
            throw new BeanException("Nom du site incorrect.");
        }
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

    public void setSecteur(List<Secteur> secteur) throws BeanException {
        if (secteur == null){
            throw new BeanException("Secteur du site incorrect.");
        }
        this.secteur = secteur;
    }
}