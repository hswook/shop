<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<c:if test="${!empty message }">
		<script type="text/javascript">alert('<c:out value='${message}' />')</script>
	</c:if>
</head>
<body>
<h1>
	Hello world!  
</h1>

<div id="member">
	<%if ( request.getSession().getAttribute("member") != null ) { %>
		<a href="/member/logout" target="_self" title="LOGOUT">LOTOUT</a>
	<%} else { %>
		<a href="/member/login" target="_self" title="LOGIN">LOGIN</a>
		<a href="/member/join" target="_self" title="JOIN">JOIN</a>
	<%} %>
</div>
<div id="content">
	<a href="/board" target="_self" title="BOARD">BOARD</a>
</div>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
