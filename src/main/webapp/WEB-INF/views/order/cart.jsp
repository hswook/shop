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
			$("#uq").click(function() {
				updateQuantity();
			});
		});
		
		function purchase() {
			if ( confirm("정말 구매하시겠습니까?") == true) {
				document.purchase.action = "/order/${orders.id}/purchase";
				document.purchase.submit();
			}
			return false;
		}
		
		function updateQuantity(poId) {
			var form = document.purchase;
			
			form.quantity.value = $("#quantity").val();
			form.productOrdersId.value = poId;
			form.action = "/order/cart/updateQuantity";
			
			form.submit();
		}
	</script>
</head>
<body>
<%@ include file="/WEB-INF/views/layout/top.jsp" %>

<div id="container" class="container container-fluid">
<h1>
	cart
</h1>
	<fieldset>
		<legend>cart list</legend>
		<hr/>
		<c:if test="${!empty cartList }">
			<table class="cart-table">
				<thead>
					<tr>
						<th>이미지</th>
						<th>상품명</th>
						<th>판매가</th>
						<th>수량</th>
						<th>합계</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${cartList}" var="cart">
						<tr>
							<td class="img"><a href="/product/all/${cart.productId }"><img src="/upload/product/${cart.mainImg }" style="width:62px;"/></a></td>
							<td class="name">${cart.name }</td>
							<td class="price">${cart.orderPrice }</td>
							<td class="quantity"><input id="quantity" type="text" value="${cart.quantity }" style="width:30px;"/><a href="#" onclick="updateQuantity(${cart.productOrdersId })">수정</a></td>
							<td class="sum">${cart.quantity * cart.orderPrice}</td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="5" class="total">총 구매금액 : <strong>${orders.totalPrice }</strong></td>
					</tr>
				</tfoot>
			</table>
		<div class="row btn-purchase">
			<a href="#purchase"><img src="/resources/assets/img/btn_payment.gif" id="btn_purchase" /></a>
		</div>
		</c:if>
		<c:if test="${empty cartList }">
			<div style="text-align: center;">장바구니에 상품이 존재하지 않습니다.</div>
		</c:if>
	</fieldset>
	
	<form id="purchase" name="purchase" method="post">
		<input type="hidden" name="ordersId" value="${orders.id }" />
		<input type="hidden" name="productOrdersId" value ="" />
		<input type="hidden" name="quantity" value="" />
	</form>
</div>
</body>
</html>
