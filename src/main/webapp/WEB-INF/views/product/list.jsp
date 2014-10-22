<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.sh.shop.domain.Member" %>

<%@ page session="false" %>

<%
	Member member = (Member)request.getSession().getAttribute("member");
%>

<!DOCTYPE html>
<html lang="ko">
<head>
	<title>product</title>
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
	Product
</h1>
	<fieldset>
		<legend>product list</legend>
		<h2><c:out value='${type}' /></h2>
		<hr/>
		<div class="row">
			<c:forEach items="${productList}" var="product">
				<div class="col-md-3 col-sm-6">
					<div class="thumbnail">
						<a href="/product/${type }/${product.id }"><img src="/upload/product/${product.mainImg}" alt="이미지" /></a>
						<div class="caption">
							<h4>${product.name }</h4>
							<p>${product.price }</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
		<%
			if (member != null && member.getEmail().equals("admin@shop.com")) {
		%>
		<div class="row right-btn">
			<a href="/product/form">상품등록</a>
		</div>
		<%}%>
	</fieldset>
</div>
</body>
</html>
