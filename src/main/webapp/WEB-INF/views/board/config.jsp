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
			<legend>board config</legend>
			<h1>${boardConfig.name}</h1><span>${boardConfig.desciption}</span>
			<hr/>
			<ul>
			<c:forEach items="${boardPosts}" var="boardPost">
				<li><a href="/board/post/${boardPost.id}"> ${boardPost.title} </a></li>
			</c:forEach>
				
			</ul>
			<a href="/board/post/form?configId=${boardConfig.id }">Write</a>
		</fieldset>
	</form>
</body>
