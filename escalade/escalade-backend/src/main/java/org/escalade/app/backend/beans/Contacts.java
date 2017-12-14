package org.escalade.app.beans;

import java.util.regex.*;


public class Contact throws BeanException {
    // attributs
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String tel;

    // constructeurs
    public Contact() {
        id = 0;
        nom = null;
        prenom = null;
        email = null;
        mdp = null;
        tel = null;
    }

    public Contact(int id, String nom, String prenom,
                    String email, String mdp, String tel)
                    throws BeanException {
        if (id == 0){
            throw new BeanException("Idenifiant du contact incorrect.");
        }
        this.id = id;
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
        if (mdp == null || mdp.compareTo("") == 0){
            throw new BeanException("Mot de passe du contact incorrect.");
        }
        this.mdp = mdp;
        if (tel == null || tel.compareTo("") == 0){
            throw new BeanException("Numéro de téléphone du contact incorrect.");
        }
        this.tel = tel;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) throws BeanException{
        if (id == 0){
            throw new BeanException("Idenifiant du contact incorrect.");
        }
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom)  throws BeanException {
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

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) throws BeanException {
        if (mdp == null || mdp.compareTo("") == 0){
            throw new BeanException("Mot de passe du contact incorrect.");
        }
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws BeanException {
        if (email == null || email.compareTo("") == 0){
            throw new BeanException("Nom du contact incorrect.");
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

    // outils
    private boolean verificationEmail(String email) {
        return Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", email);
    }
}