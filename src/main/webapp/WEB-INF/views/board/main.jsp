<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html lang="ko">
<head>
	<title>board</title>
	<c:if test="${!empty message }">
		<script type="text/javascript">alert('<c:out value='${message}' />')</script>
	</c:if>
</head>
<body>
<h1>
	board
</h1>
	<form id="board" name="board" method="post">
		<fieldset>
			<legend>board main</legend>
			<ul>
			<c:forEach items="${boardCategories}" var="boardCategory">
				<li><a href="board/category/${boardCategory.id}">${boardCategory.name} (${boardCategory.homeUrl})</a></li>
			</c:forEach>
				
			</ul>
		</fieldset>
	</form>
</body>
</html>