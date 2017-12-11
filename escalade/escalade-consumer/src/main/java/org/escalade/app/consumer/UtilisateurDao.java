import java.util.List;

import Utilisateur;

public interface UtilisateurDao {
    void ajouter( Utilisateur utilisateur ) throws DaoException;
    List<Utilisateur> lister() throws DaoException;
    void supprimer(Utilisateur utilisateur) throws DaoException;
}