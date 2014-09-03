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
</head>
<body>
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
</body>
</html>
