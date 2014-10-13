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
	<script data-main="/resources/js/main" src="/resources/assets/lib/jquery/jquery-1.11.0.min.js"></script>
	<script data-main="/resources/js/main" src="/resources/js/util.js"></script>
	<script data-main="/resources/js/main" src="/resources/js/navi.js"></script>
	<script src="/resources/assets/lib/ckeditor/ckeditor.js"></script>
	<link rel="stylesheet" href="/resources/assets/lib/bootstrap/css/bootstrap.css">
	<link rel="stylesheet" href="/resources/assets/lib/bootstrap/css/bootstrap-theme.css">
	<link rel="stylesheet" href="/resources/css/common.css">
	<link rel="stylesheet" href="/resources/css/navi.css">
</head>
<body>
<%@ include file="/WEB-INF/views/layout/top.jsp" %>

<div class="container container-fluid">

<h1>
	board
</h1>
	<form id="board" name="board" method="post">
		<fieldset>
			<legend>board form</legend>
			<span>title</span><input name="title" type="text" value="${boardPost.title }"><br />
			<span>content</span><br />
			<textarea id="content" name="content" rows="10" cols="80">
				${boardPost.content }
			</textarea>
			<script type="text/javascript">
				CKEDITOR.replace("content");
			</script>
			<input type="submit" value="submit" />
		</fieldset>
	</form>
</div>
</body>
</html>