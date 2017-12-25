package org.escalade.app.backend.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.escalade.app.backend.beans.BeanException;
import org.escalade.app.backend.beans.Utilisateur;

public class Noms {
    private Connection connexion;
    
    public List<Utilisateur> recupererUtilisateurs() {
        List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
        Statement statement = null;
        ResultSet resultat = null;

        loadDatabase();
        
        try {
            statement = connexion.createStatement();

            // Execution de la requete
            resultat = statement.executeQuery("SELECT pseudo FROM utilisateurs;");

            // Recuperation des donnees
            while (resultat.next()) {
                String nom = resultat.getString("pseudo");
                
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setPseudo(nom);

                // TODO

                
                utilisateurs.add(utilisateur);
            }
        } catch (SQLException e) {

        } catch (BeanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }
        
        return utilisateurs;
    }
    
    private void loadDatabase() {
        // Chargement du driver
        try {
            Class.forName("org.postgresql.driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            connexion = DriverManager.getConnection("jdbc:postgresql://localhost:3306/escalade", "root", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        loadDatabase();
        
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO utilisateurs(pseudo) VALUES(?);");
            preparedStatement.setString(1, utilisateur.getPseudo());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void supprimerUtilisateur(Utilisateur utilisateur) {
        loadDatabase();
        
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("delete from utilisateurs wherepseudo=?;");
            preparedStatement.setString(1, utilisateur.getPseudo());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}