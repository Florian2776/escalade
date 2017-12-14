package org.escalade.app.beans;

public class voie {
    // attributs
    private int id;
    private String nom;
    private int nbVoies;
    private List<Voie> voie;

    // constructeurs
    public Secteur() {
        id = 0;
        nom = null;
        nbVoies = 0;
        voie = null;
    }

    public Secteur(int id, String nom, int nbVoies, List<Voie> voie) throws BeanException {
        if (id == 0){
            throw new BeanException("Identifiant du secteur incorrect.");
        }
        this.id = id;
        if (nom == null){
            throw new BeanException("Nom du secteur incorrect.");
        }
        this.nom = nom;
        this.nbVoies = nbVoies;
        if (voie == null){
            throw new BeanException("Voie du secteur incorrect.");
        }
        this.voie = voie;
    }

    // getter and voie
    public int getId() {
        return id;
    }

    public void setId(int id) throws BeanException {
        if (id == null){
            throw new BeanException("Identifiant du secteur incorrect.");
        }
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws BeanException {
        if (nom == null || nom.compateTo("") == 0){
            throw new BeanException("Nom du secteur incorrect.");
        }
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

    public void setvoie(List<Voie> voie) throws BeanException {
        if (voie == null){
            throw new BeanException("Voie du secteur incorrect.");
        }
        this.voie = voie;
    }
}