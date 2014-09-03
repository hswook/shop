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
			<legend>board post</legend>
			<h1>${boardPost.title}</h1><span>${boardPost.memberEmail}</span>
			<hr/>
			<div id="boardContent">	
				${boardPost.content }
			</div>
			<a href="/board/post/${boardPost.id}/form">수정</a>&nbsp;&nbsp;<a href="/board/post/${boardPost.id}/delete">삭제</a>
		</fieldset>
	</form>
</body>
