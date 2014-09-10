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
	<script data-main="/resources/js/main" src="/resources/assets/lib/jquery/jquery-1.11.0.min.js"></script>
	<script data-main="/resources/js/main" src="/resources/assets/lib/slidejs/jquery.slides.min.js"></script>
	<script data-main="/resources/js/main" src="/resources/js/util.js"></script>
	<script data-main="/resources/js/main" src="/resources/js/navi.js"></script>
	<link rel="stylesheet" href="/resources/assets/bootstrap/bootstrap.css">
	<link rel="stylesheet" href="/resources/assets/bootstrap/bootstrap-theme.css">
	<link rel="stylesheet" href="/resources/css/common.css">
	<link rel="stylesheet" href="/resources/css/slide.css">
	
	<script type="text/javascript">
		$(function() {
			$('#slides').slidesjs({
				width : 940,
				height : 528,
				play : {
					active : true,
					auto : true,
					interval : 4000,
					swap : true
				}
			});
		});
	</script>
</head>
<body>
<%@ include file="/WEB-INF/views/layout/top.jsp" %>
<div id="container" class="container-fluid">
	<div class="row">
		<div id="slides">
			<img src="/resources/assets/img/back1.jpg" alt="" />
			<img src="/resources/assets/img/back2.jpg" alt="" />
		</div>
	</div>
	<div style="display:block; margin:10px 0 25px 0;">
		<h3 style="border-bottom:2px solid #72c02c; margin:0 0 -2px 0; padding-bottom:5px; display: inline-block;">Weekly best</h3>
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
	<footer id="footer">
		<div class="footerutil">
			<%if ( request.getSession().getAttribute("member") != null ) { %>
			<a href="/member/logout" target="_self" title="LOGOUT">LOTOUT</a>
		<%} else { %>
			<a href="/member/login" target="_self" title="LOGIN">LOGIN</a>
			<a href="/member/join" target="_self" title="JOIN">JOIN</a>
		<%} %>
		</div>
		<p>footer content</p>
	</footer>
</div>
</body>
</html>
