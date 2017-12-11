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

    <%@ include file="erreur.jsp" %>

	<c:if test="${ empty erreur }">
		<h2>Liste des utilisateurs :</h2>

	    <ul>
		    <c:forEach var="utilisateur" items="${ utilisateurs }">
		    	<li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" /></li>
		    </c:forEach>
		</ul>
	</c:if>
</body>
</html>