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
		<input type="hidden" name="configId" value="${configId }" />
		<fieldset>
			<legend>board form</legend>
			<span>title</span><input name="title" type="text" value="${boardPost.title }"><br />
			<span>content</span><br /><input name="content" type="textarea" value="${boardPost.content }" style="width:300px; height:200px;" />
			<input type="submit" value="submit" />
		</fieldset>
	</form>
</body>
</html>