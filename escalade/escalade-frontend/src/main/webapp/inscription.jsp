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
	    	<label for="pseudo">Pseudo : </label>
	    	<input type="text" name="pseudo" id="pseudo" />
    	</p>
    	
    	<input type="reset"  value="effacer" />
    	<input type="submit"  value="s'inscrire" />
    </form>
    
    <h2>Liste des utilisateurs inscrits :</h2>
    <ul>
	    <c:forEach var="utilisateur" items="${ utilisateurs }">
	    	<li><c:out value="${ utilisateur.pseudo }" /></li>
	    </c:forEach>
	</ul>    
</body>
</html>