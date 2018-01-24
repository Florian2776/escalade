<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
    <title>Inscription</title>
</head>

<body>


	<h2>Nouveau membre ?</h2>
	
	<p>Pour faire partie de l'équipe, rien de plus simple, il te suffit de remplir le formulaire pour t'enregistrer !</p>

    <c:if test="${ !empty erreur }"><p style="color:red;"><c:out value="${ erreur }" /></p></c:if>
    
	<form method="post" action="inscription.jsp">
    	<p>
	    	<label for="pseudo">Pseudo : </label>
	    	<input type="text" name="pseudo" id="pseudo" />
    	</p>

    	<p>
            <label for="nom">Nom : </label>
            <input type="text" name="nom" id="nom" />
        </p>

    	<p>
            <label for="prenom">Prénom : </label>
            <input type="text" name="prenom" id="prenom" />
        </p>

        <p>
            <label for="naissance">Date de naissance : </label>
            <input type="date" name="naissance" id="naissance" />
        </p>

        <p>
            <label for="mdp">Mot de passe : </label>
            <input type="password" name="mdp" id="mdp" />
        </p>

        <p>
            <label for="mdp2">Confirmation du mot de passe : </label>
            <input type="password" name="mdp2" id="mdp2" />
        </p>

        <p>
            <label for="experience">Niveau d'experience :</label>
            <select name="experience" id="experience" size="1">
                <option value="1" selected>Débutant</option>
                <option value="2">Intermédiaire</option>
                <option value="3">Expert</option>
            </select>
        </p>

        <p>
            <label for="email">Email : </label>
            <input type="email" name="email" id="email" />
        </p>

        <p>
            <label for="tel">Téléphone : </label>
            <input type="tel" name="tel" id="tel" />
        </p>

    	<input type="reset"  value="réinitialisation" />
    	<input type="submit"  value="inscription" />
    </form>
    
    <h2>Liste des utilisateurs inscrits :</h2>
    <%-- <ul>
	    <c:forEach var="utilisateur" items="${ utilisateurs }">
	    	<li><c:out value="${ utilisateur.pseudo }" /></li>
	    </c:forEach>
	</ul>  --%>   
</body>
</html>