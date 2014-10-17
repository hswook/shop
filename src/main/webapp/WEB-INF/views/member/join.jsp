<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>

<!DOCTYPE html>
<html lang="ko">
<head>
	<title>login</title>
	<c:if test="${!empty message }">
		<script type="text/javascript">alert('<c:out value='${message}' />')</script>
	</c:if>
	<script data-main="/resources/js/main" src="/resources/assets/lib/jquery/jquery-1.11.0.min.js"></script>
	<script data-main="/resources/js/main" src="/resources/js/util.js"></script>
	<script data-main="/resources/js/main" src="/resources/js/navi.js"></script>
	<link rel="stylesheet" href="/resources/assets/lib/bootstrap/css/bootstrap.css">
	<link rel="stylesheet" href="/resources/assets/lib/bootstrap/css/bootstrap-theme.css">
	<link rel="stylesheet" href="/resources/css/common.css">
	<link rel="stylesheet" href="/resources/css/navi.css">
</head>
<body>
<%@ include file="/WEB-INF/views/layout/top.jsp" %>

<div id="container" class="container container-fluid">
<h1>
	Join  
</h1>
	<form id="join" name="join" method="post">
		<fieldset>
			<legend>join</legend>
		    Name: <input type="text" name="name" /><br />
		    Email: <input type="text" name="email" /><br />
		    Pasword: <input type="password" name="pw" /><br />
		    <input type="submit" value="GO" />
		</fieldset>
	</form>
</div>
</body>
</html>
