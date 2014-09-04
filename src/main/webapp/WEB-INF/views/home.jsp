<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head lang="ko">
<meta charset="UTF-8">
	<title>애견</title>
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
<div id="container" class="container-fluid">
	<div style="width:100%; height:400px;">
		<div style="z-index:10; position:absolute;text-align:left;">
			<h2>test<br/>test3<br/>test2</h2>
			<p style="font-size:18px; font-wiight:400; line-height:25px; top:300px; margin-left:2%">
				asdasdasd<br/>asdasd<br/>asdasdsadas
			</p>	
		</div>
		<img alt="main" src="/resources/assets/img/main.jpg" style="" />
	</div>
	<div class="row">
		<div class="col-md-10">
			<span style="font-size:24px; line-height:35px; margin-bottom:12px; color:#666; display:block;'">"쇼핑몰에 오신걸을 환영합니다."</span>
			<p style="color:#555;">Hello.</p>
		</div>
		<div class="col-md-2">
			<a href="/member/join" class="btn btn-success btn-lg" style="padding-left:50px; padding-right:50px; margin-top:15px;">Join</a>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<div>
				<h4>title1</h4>
				<p>내용12345 내용12345 내용12345 내용12345 내용12345 내용12345 내용12345 </p>
			</div>
		</div>
		<div class="col-md-4">
			<div>
				<h4>title2</h4>
				<p>내용12345 내용12345 내용12345 내용12345 내용12345 내용12345 내용12345 </p>
			</div>
		</div>
		<div class="col-md-4">
			<div>
				<h4>title3</h4>
				<p>내용12345 내용12345 내용12345 내용12345 내용12345 내용12345 내용12345 </p>
			</div>
		</div>
	</div>
	<div style="display:block; margin:10px 0 25px 0;">
		<h3 style="border-bottom:2px solid #72c02c; margin:0 0 -2px 0; padding-bottom:5px; display: inline-block;">최근 판매상품</h3>
	</div>
	<div class="row">
		<div class="col-md-3 col-sm-6">
			<div class="thumbnail">
				<a><img src="" alt="이미지" width="500px;" height="100px;"/></a>
				<div class="caption">
					<h4>상품제목</h4>
					<p>품설명 기타설명 등등등</p>
				</div>
			</div>
		</div>
		<div class="col-md-3 col-sm-6">
			<div class="thumbnail">
				<a><img src="" alt="이미지" width="500px;" height="100px;"/></a>
				<div class="caption">
					<h4>상품제목</h4>
					<p>품설명 기타설명 등등등</p>
				</div>
			</div>
		</div>
		<div class="col-md-3 col-sm-6">
			<div class="thumbnail">
				<a><img src="" alt="이미지" width="500px;" height="100px;"/></a>
				<div class="caption">
					<h4>상품제목</h4>
					<p>품설명 기타설명 등등등</p>
				</div>
			</div>
		</div>
		<div class="col-md-3 col-sm-6">
			<div class="thumbnail">
				<a><img src="" alt="이미지" width="500px;" height="100px;"/></a>
				<div class="caption">
					<h4>상품제목</h4>
					<p>품설명 기타설명 등등등</p>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-8">
			<div style="display:block; margin:10px 0 25px 0;">
				<h3 style="border-bottom:2px solid #72c02c; margin:0 0 -2px 0; padding-bottom:5px; display: inline-block;">주절주절</h3>
			</div>
			<div class="row">
				<div class="col-sm-4">
					<img alt="이미지" src="" class="img-responsive" width="500px" height="100px">
				</div>
				<div class="col-sm-8">
					<p>내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 내용하나둘셋넷다섯 </p>
					<ul class="list-unstyled">
						<li>list1</li>
						<li>list2</li>
						<li>list3</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div style="display:block; margin:10px 0 25px 0;">
				<h3 style="border-bottom:2px solid #72c02c; margin:0 0 -2px 0; padding-bottom:5px; display: inline-block;">바보바보</h3>
				<div class="carousel">
					<div class="carousel-inner">
						<div class="item">
							<img alt="이미지" src="">
							<div class="carousel-caption">caption</div>
						</div>
						<div class="item">
							<img alt="이미지" src="">
							<div class="carousel-caption">caption</div>
						</div>
						<div class="item">
							<img alt="이미지" src="">
							<div class="carousel-caption">caption</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="footer">
		footer
	</div>
</div>

<div>
	<%if ( request.getSession().getAttribute("member") != null ) { %>
	<a href="/member/logout" target="_self" title="LOGOUT">LOTOUT</a>
<%} else { %>
	<a href="/member/login" target="_self" title="LOGIN">LOGIN</a>
	<a href="/member/join" target="_self" title="JOIN">JOIN</a>
<%} %>
</div>

</body>
</html>
