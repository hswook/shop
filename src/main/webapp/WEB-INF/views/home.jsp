<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 부트스트랩 -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    
	<script src="/js/jquery-1.11.1.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
    <c:if test="${!empty message }">
		<script type="text/javascript">alert('<c:out value='${message}' />')</script>
	</c:if>
</head>
<body>
<%=request.getSession().getAttribute("member") %>

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
