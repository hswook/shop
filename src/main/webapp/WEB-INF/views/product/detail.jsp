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
	<link rel="stylesheet" href="/resources/assets/lib/bootstrap/css/bootstrap.css">
	<link rel="stylesheet" href="/resources/assets/lib/bootstrap/css/bootstrap-theme.css">
	<link rel="stylesheet" href="/resources/css/common.css">
	<link rel="stylesheet" href="/resources/css/navi.css">
	
	<script type="text/javascript">
		function buyNow() {
			var form = document.purchase;
			var qv = $("#qv").val();
			if (isNaN(qv)) {
				alert("quantity must be numeric value!");
				return false;
			}
			form.quantity.value = $("#qv").val();
			form.action = "/order/purchase/product/${product.id}";
			if(confirm("정말 구매하시겠습니까?") == true) {
				form.submit();
			}
		}

		function addToCart() {
			var form = document.purchase;
			var qv = $("#qv").val();
			if (isNaN(qv)) {
				alert("quantity must be numeric value!");
				return false;
			}
			form.quantity.value = $("#qv").val();
			form.action = "/order/cart";
			form.method = "post";
			form.submit();
		}

		function wishList() {
			var form = document.purchase;
			form.action = "/order/wishlist/${product.id}";
			form.method = "post";
			form.submit();
		}
	</script>
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
				<table class="product-detail-table">
					<tr>
						<th>type</th>
						<td>${product.type }</td>
					</tr>
					<tr>
						<th>price</th>
						<td>${product.price }</td>
					</tr>
					<tr>
						<th>quantity</th>
						<td><input type="text" name="qv" id="qv" value="1" /></td>
					</tr>
				</table>
				<div class="product-btn-area">
					<a class="point" onclick="buyNow(); return false;">BUY NOW</a>
					<a class="" onclick="addToCart();">ADD TO CART</a>
					<a class="" onclick="wishList();">ADD TO WISHLIST</a>
				</div>
			</div>
		</div>
		<hr />
		<div class="row">
			${product.content }
		</div>
		<%
			if (member != null && member.getEmail().equals("admin@shop.com")) {
		%>
			<div class="row right-btn">
				<a href="/product/${product.id }/form">수정</a>
				<a href="/product/${product.id }/delete">삭제</a>
			</div>
		<%} %>

	</fieldset>
	<form id="purchase" name="purchase" method="post">
		<input type="hidden" name="productId" value="${product.id }" />
		<input type="hidden" name="quantity" value="" />
	</form>
</div>
</body>
</html>
