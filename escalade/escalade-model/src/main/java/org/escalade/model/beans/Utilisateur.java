package org.escalade.model.beans;

import java.util.*;
import java.util.regex.Pattern;

public class Utilisateur {
    // attributs
    private int id;
    private String pseudo;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private Date naissance;
    private String mdp;
    private int experience;
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
        experience = 1;
        nbArticles = 0;
        nbTopos = 0;
        nbSites = 0;
        nbCommentaires = 0;
        estConnecte = true;
    }

    public Utilisateur(int id, String pseudo, String nom, String prenom,
            String email, String tel, Date naissance, String mdp, int experience,
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
        if (nom == null || nom.compareTo("") == 0){
            throw new BeanException("Nom du contact incorrect.");
        }
        this.nom = nom;
        if (prenom == null || prenom.compareTo("") == 0){
            throw new BeanException("Prénom du contact incorrect.");
        }
        this.prenom = prenom;
        if (email == null || email.compareTo("") == 0){
            throw new BeanException("Nom du contact incorrect.");
        }

        if (!verificationEmail(email)) {
            throw new BeanException("Adresse email du contact non valide.");
        }
        this.email = email;
        if (tel.compareTo("") == 0) {
            throw new BeanException("Téléphone du contact non valide.");
        }
        this.tel = tel;
        this.naissance = naissance;
        if (mdp == null || mdp.compareTo("") == 0){
            throw new BeanException("Mot de passe de l'utilisateur incorrect.");
        }
        this.mdp = mdp;
        this.experience = experience;
        this.nbArticles = nbArticles;
        this.nbTopos = nbTopos;
        this.nbSites = nbSites;
        this.nbCommentaires = nbCommentaires;
        this.estConnecte = true;
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
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws BeanException {
        if (nom == null || nom.compareTo("") == 0){
            throw new BeanException("Nom du contact incorrect.");
        }
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) throws BeanException {
        if (prenom == null || prenom.compareTo("") == 0){
            throw new BeanException("Prenom du contact incorrect.");
        }
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws BeanException {
        if (email == null || email.compareTo("") == 0){
            throw new BeanException("Email du contact incorrect.");
        }

        if (!verificationEmail(email)) {
            throw new BeanException("Adresse email du contact non valide.");
        }
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) throws BeanException {
        if (tel == null || tel.compareTo("") == 0){
            throw new BeanException("Numéro de téléphone du contact incorrect.");
        }
        this.tel = tel;
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
    	switch (experience) {
    	case 1 :
    		return "Débutant";
    	case 2 :
    		return "Intermédiaire";
    	case 3 :
    		return "Confirmé";
    	default :
    		return "Débutant";
        }
    }

    public void setExperience(int experience) throws BeanException {
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
    
    // outils
    private boolean verificationEmail(String email) {
        return Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", email);
    }
}