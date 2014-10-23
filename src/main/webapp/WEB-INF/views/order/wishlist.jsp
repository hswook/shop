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
	<link rel="stylesheet" href="/resources/assets/lib/bootstrap/css/bootstrap.css">
	<link rel="stylesheet" href="/resources/assets/lib/bootstrap/css/bootstrap-theme.css">
	<link rel="stylesheet" href="/resources/css/common.css">
	<link rel="stylesheet" href="/resources/css/navi.css">
	
	<script type="text/javascript">
	
		$(function() {
			$("#btn_purchase").click(function() {
				purchase();
			});
		});
		
		function purchase() {
			if ( confirm("정말 구매하시겠습니까?") == true) {
				document.purchase.action = "/order/${orders.id}/purchase";
				document.purchase.submit();
			}
			return false;
		}
	</script>
</head>
<body>
<%@ include file="/WEB-INF/views/layout/top.jsp" %>

<div id="container" class="container container-fluid">
<h1>
	wishlist
</h1>
	<fieldset>
		<legend>wishlist</legend>
		<hr/>
		<c:if test="${!empty wishlist }">
			<table class="cart-table">
				<thead>
					<tr>
						<th>이미지</th>
						<th>상품명</th>
						<th>판매가</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${wishlist}" var="product">
						<tr>
							<td class="img"><img src="/upload/product/${product.mainImg }" style="width:62px;"/></td>
							<td class="name">${product.name }</td>
							<td class="price">${product.price }</td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
				</tfoot>
			</table>
		</c:if>
		<c:if test="${empty wishlist }">
			<div style="text-align: center;">wishlist에 상품이 존재하지 않습니다.</div>
		</c:if>
	</fieldset>
</div>
</body>
</html>
