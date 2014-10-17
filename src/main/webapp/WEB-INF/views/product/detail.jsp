<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>

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
		<legend>product detail</legend>
		<h2><c:out value='${type}' /></h2>
		<hr/>
		
		<div class="row">
			<div class="col-md-4">
				<div class="thumbnail">
					<img src="/upload/product/${product.mainImg }" />
				</div>
			</div>
			<div class="col-md-8">
				<h3>${product.name }</h3>
				<p>
					${product.price }
				<p>
				<div class="product-btn-area">
					<a class="point">BUY NOW</a>
					<a class="">ADD TO CART</a>
					<a class="">ADD TO WISHLIST</a>
				</div>
			</div>
		</div>
		<hr />
		<div class="row">
			${product.content }
		</div>
		<div class="row">
			<a href="/product/${product.id }/form">수정</a>
			<a href="/product/${product.id }/delete">삭제</a>
		</div>

	</fieldset>
</div>
</body>
</html>
