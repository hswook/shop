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
	<script data-main="/resources/js/main" src="/resources/lib/jquery/jquery-2.1.0.min.js"></script>
	<script data-main="/resources/js/main" src="/resources/js/util.js"></script>
	<link rel="stylesheet" href="/resources/assets/bootstrap/bootstrap.css">
	<link rel="stylesheet" href="/resources/assets/bootstrap/bootstrap-theme.css">
	<link rel="stylesheet" href="/resources/css/common.css">
</head>
<body>
<jsp:include page="/WEB-INF/views/layout/top.jsp"></jsp:include>

<div class="container container-fluid">
<h1>
	Login  
</h1>
	<form id="login" name="login" method="post">
		<fieldset>
			<legend>login</legend>
		    Email: <input type="text" name="email" /><br />
		    Pasword: <input type="password" name="pw" /><br />
		    <input type="submit" value="GO" />
		</fieldset>
	</form>
</div>
</body>
</html>
