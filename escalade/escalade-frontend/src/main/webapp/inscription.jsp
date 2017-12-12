<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Inscription</title>
</head>
<body>

	<%@ include file="menu.jsp" %>

	<h2>Nouveau membre ?</h2>
	
	<p>Pour faire partie de l'équipe, rien de plus simple, il te suffit de remplir le formulaire pour t'enregistrer !</p>

    <c:if test="${ !empty erreur }"><p style="color:red;"><c:out value="${ erreur }" /></p></c:if>
    
	<form method="post" action="inscription">
    	<p>
	    	<label for="nom">Nom : </label>
	    	<input type="text" name="nom" id="nom" />
    	</p>
    	
    	<p>
	    	<label for="prenom">Prénom : </label>
	    	<input type="text" name="prenom" id="prenom" />
    	</p>
    	
    	<p>
	    	<label for=password">Mot de passe : </label>
	    	<input type="password" name="password" id="passsword" />
    	</p>
    	
    	<input type="reset"  value="effacer" />
    	<input type="submit"  value="s'inscrire" />
    </form>
    
    <h2>Liste des utilisateurs inscrits :</h2>
    <ul>
	    <c:forEach var="utilisateur" items="${ utilisateurs }">
	    	<li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" /></li>
	    </c:forEach>
	</ul>    
</body>
</html>