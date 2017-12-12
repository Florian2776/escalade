<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Index</title>
</head>
<body>

	<%@ include file="menu.jsp" %>
	
	<h2>Index</h2> 
	
	
	<c:if test="${ !empty erreur }"><p style="color:red;"><c:out value="${ erreur }" /></p></c:if>
	
	<c:if test="${ empty erreur }">
		<h2>Liste des utilisateurs inscrits :</h2>
	    
	    <ul>
		    <c:forEach var="utilisateur" items="${ utilisateurs }">
		    	<li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" /></li>
		    </c:forEach>
		</ul>  
	</c:if>
</body>
</html>