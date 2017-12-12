package org.escalade.app.beans;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String password;
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) throws BeanException {
        if (nom.length() < 2 || nom.length() > 10) {
            throw new BeanException("Le nom doit faire au moins deux caract�res et ne pas d�passer 10 caract�res.");
        } else {
            this.nom = nom; 
        }
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) throws BeanException {
    	if (prenom.length() < 2 || prenom.length() > 20) {
            throw new BeanException("Le pr�nom doit faire au moins deux caract�res et ne pas d�passer 20 caract�res.");
        } else {
            this.prenom = prenom; 
        }
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws BeanException {
		if (prenom.length() < 4 || prenom.length() > 15) {
            throw new BeanException("La taille du mot de passe doit �tre comprise entre 4 et 15 caract�res ");
        } else {
        	this.password = password; 
        }
	}
}