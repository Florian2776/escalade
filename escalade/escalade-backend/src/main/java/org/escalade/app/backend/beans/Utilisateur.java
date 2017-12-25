package org.escalade.app.backend.beans;

import java.util.*;

public class Utilisateur {
    // attributs
    public enum Niveau {
        DEBUTANT("débutant"),
        INTERMEDIAIRE("intermédiaire"),
        CONFIRME("confirmé");

        private String niv = "";
        
        Niveau(String n) {
        	niv = n;
        }
        
        public String getNiv() {
            return niv;
        }
    }

    private int id;
    private String pseudo;
    private Date naissance;
    private String mdp;
    private Niveau experience;
    private int nbArticles;
    private int nbTopos;
    private int nbSites;
    private int nbCommentaires;
    private boolean estConnecte;

    // constucteurs
    public Utilisateur() {
        id = 0;
        pseudo = null;
        naissance = null;
        mdp = null;
        experience = Niveau.DEBUTANT;
        nbArticles = 0;
        nbTopos = 0;
        nbSites = 0;
        nbCommentaires = 0;
        estConnecte = false;
    }

    public Utilisateur(int id, String pseudo, Date naissance, String mdp, Niveau experience,
                       int nbArticles, int nbTopos, int nbSites, int nbCommentaires, boolean est_connecte)
                       throws BeanException {
        if (id == 0){
            throw new BeanException("Identifiant de l'utilisateur incorrect.");
        }
        this.id = id;
        if (pseudo == null || pseudo.compareTo("") == 0){
            throw new BeanException("Pseudo de l'utilisateur incorrect.");
        }
        this.pseudo = pseudo;
        if (naissance == null){
            throw new BeanException("Date de naissance de l'utilisateur incorrect.");
        }
        this.naissance = naissance;
        if (mdp == null || mdp.compareTo("") == 0){
            throw new BeanException("Mot de passe de l'utilisateur incorrect.");
        }
        this.mdp = mdp;
        if (experience == null){
            throw new BeanException("Expérience de l'utilisateur incorrect.");
        }
        this.experience = experience;
        this.nbArticles = nbArticles;
        this.nbTopos = nbTopos;
        this.nbSites = nbSites;
        this.nbCommentaires = nbCommentaires;
        this.estConnecte = false;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) throws BeanException {
        if (id == 0){
            throw new BeanException("Identifiant de l'utilisateur incorrect.");
        }
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) throws BeanException {
        if (pseudo == null || pseudo.compareTo("") == 0){
            throw new BeanException("Pseudo de l'utilisateur incorrect.");
        }
        this.pseudo = pseudo;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) throws BeanException {
        if (naissance == null){
            throw new BeanException("Date de naissance de l'utilisateur incorrect.");
        }
        this.naissance = naissance;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) throws BeanException {
        if (mdp == null || mdp.compareTo("") == 0){
            throw new BeanException("Mot de passe de l'utilisateur incorrect.");
        }
        this.mdp = mdp;
    }

    public String getExperience() {
        return experience.getNiv();
    }

    public void setExperience(Niveau experience) throws BeanException {
        if (experience == null){
            throw new BeanException("Expérience de l'utilisateur incorrect.");
        }
        this.experience = experience;
    }

    public int getNbArticles() throws BeanException {
        return nbArticles;
    }

    public void setNbArticles(int nbArticles) {
        this.nbArticles = nbArticles;
    }

    public int getNbTopos() {
        return nbTopos;
    }

    public void setNbTopos(int nbTopos) {
        this.nbTopos = nbTopos;
    }

    public int getNbSites() {
        return nbSites;
    }

    public void setNbSites(int nbSites) {
        this.nbSites = nbSites;
    }

    public int getNbCommentaires() {
        return nbCommentaires;
    }

    public void setNbCommentaires(int nbCommentaires) {
        this.nbCommentaires = nbCommentaires;
    }

    public boolean isEstConnecte() {
        return estConnecte;
    }

    public void setEstConnecte(boolean estConnecte) {
        this.estConnecte = estConnecte;
    }
}