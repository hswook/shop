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
<div class="wrapper">
	<div class="navbar navbar-default navbar-fixed-top breadcrumb" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand" href="/"><b>개팔이</b></a>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="open"><a href="/">About Us</a>
					<ul class="dropdown-menu">
						<li class="dropdown-header">About Us</li>
						<li><a>Brand Story</a></li>
						<li><a>Contact Us</a></li>
					</ul>
				</li>
				<li class=""><a href="/">Shopping</a>
					<ul class="dropdown-menu">
						<li><a>All</a></li>
						<li><a>T-Shirt</a></li>
						<li><a>Outer</a></li>
						<li><a>Knit</a></li>
						<li><a>Pants & Skirt</a></li>
						<li><a>All In One</a></li>
					</ul>
				</li>
				<li class=""><a href="/">Board</a>
					<ul class="dropdown-menu">
						<li><a>Notice</a></li>
						<li><a>Q & A</a></li>
						<li><a>Review</a></li>
					</ul>
				</li>
			</ul>
			<ul class="nav navbar-nav pull-right">
				<li class=""><a href="/">Join</a></li>
				<li class=""><a href="/">login</a></li>
				<li class=""><a href="/">etc</a></li>
			</ul>
		</div>
	</div>
	<div style="width:100%; height:400px; background-color:skyblue; position:relative; margin:0 auto; overflow:hidden; background-position: -50% 0%;">
		<div style="z-index:10; position:absolute; text-align:left; width:100%; height:100%;">
			<h2 style="left:10%; opacity: 1; top:100px; z-index:10; margin-left:-2%; position:absolute;">test<br/>test3<br/>test2</h2>
			<p style="font-size:18px; font-weight:400; line-height:25px; width:100%; top:250px; margin-left:-2%; position:absolute; overflow:hidden; left:10%;">
				asdasdasd<br/>asdasd<br/>asdasdsadas
			</p>	
		</div>
	</div>
	<div id="container" class="container-fluid">
		<div class="row">
			<div class="col-md-10">
				<span style="font-size:24px; line-height:35px; margin-bottom:12px; color:#666; display:block;'">"개팔이 쇼핑몰에 오신걸을 환영합니다. 이곳은 개를 팝니다."</span>
				<p style="color:#555;"> asdasdasdasd  asdasdasdasd  asdasdasdasd  asdasdasdasd  asdasdasdasd  asdasdasdasd  asdasdasdasd  asdasdasdasd  asdasdasdasd  asdasdasdasd  asdasdasdasd  asdasdasdasd </p>
			</div>
			<div class="col-md-2">
				<a href="#" class="btn btn-success btn-lg" style="padding-left:50px; padding-right:50px; margin-top:15px;">Join</a>
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
