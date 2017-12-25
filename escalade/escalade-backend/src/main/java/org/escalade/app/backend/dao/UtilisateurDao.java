package org.escalade.app.backend.dao;

import java.util.List;

import org.escalade.app.backend.beans.Utilisateur;
import org.escalade.app.backend.dao.DaoException;

public interface UtilisateurDao {
    void ajouter( Utilisateur utilisateur ) throws DaoException;
    List<Utilisateur> lister() throws DaoException;
	void supprimer(Utilisateur utilisateur) throws DaoException;
}