package org.escalade.consumer.dao;

import java.util.List;

import org.escalade.model.beans.Utilisateur;
import org.escalade.consumer.dao.DaoException;

public interface UtilisateurDao {
    void ajouter( Utilisateur utilisateur ) throws DaoException;
    List<Utilisateur> lister() throws DaoException;
	void supprimer(Utilisateur utilisateur) throws DaoException;
}