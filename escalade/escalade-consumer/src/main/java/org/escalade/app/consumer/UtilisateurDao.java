package com.octest.dao;

import java.util.List;

import com.octest.beans.Utilisateur;

public interface UtilisateurDao {
    void ajouter( Utilisateur utilisateur ) throws DaoException;
    List<Utilisateur> lister() throws DaoException;
    void supprimer(Utilisateur utilisateur) throws DaoException;
}