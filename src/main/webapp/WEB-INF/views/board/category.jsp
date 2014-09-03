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
			<legend>board category</legend>
			<h1>${boardCategory.name}</h1><span>${boardCategory.description}</span>
			<hr/>
			<ul>
			<c:forEach items="${boardConfigs}" var="boardConfig">
				<li>${boardConfig.name} : ${boardConfig.desciption}</li>
			</c:forEach>
				
			</ul>
		</fieldset>
	</form>
</body>
