<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Suppression</title>
</head>
<body>

	<%@ include file="menu.jsp" %>

	<h2>Suppression d'un membre :</h2>
	
	<p>Pour supprimer un membre, rien de plus simple, il suffit de remplir le formulaire :</p>

    <c:if test="${ !empty erreur }"><p style="color:red;"><c:out value="${ erreur }" /></p></c:if>
    
	<form method="post" action="suppression">
    	<p>
	    	<label for="pseudo">Pseudo : </label>
	    	<input type="text" name="pseudo" id="pseudo" />
    	</p>
    	
    	<input type="reset"  value="effacer" />
    	<input type="submit"  value="supprimer" />
    </form>
    
    <h2>Liste des utilisateurs inscrits :</h2>
    <ul>
	    <c:forEach var="utilisateur" items="${ utilisateurs }">
	    	<li><c:out value="${ utilisateur.pseudo }" /></li>
	    </c:forEach>
	</ul>    
</body>
</html>