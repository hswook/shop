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
	<script data-main="/resources/js/main" src="/resources/js/util.js"></script>
	<link rel="stylesheet" href="/resources/assets/bootstrap/bootstrap.css">
	<link rel="stylesheet" href="/resources/assets/bootstrap/bootstrap-theme.css">
	<link rel="stylesheet" href="/resources/css/common.css">
</head>
<body>
<div class="container">
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
						<li><a>menu2</a></li>
					</ul>
				</li>
				<li><a>test</a></li>
				<li class="open"><a href="/">Shopping</a>
					<ul class="dropdown-menu">
						<li><a>All</a></li>
						<li><a>T-Shirt</a></li>
						<li><a>Outer</a></li>
						<li><a>Knit</a></li>
						<li><a>Pants & Skirt</a></li>
						<li><a>All In One</a></li>
					</ul>
				</li>
				<li><a>testtesttest</a></li>
				<li class="open"><a href="/">Board</a>
					<ul class="dropdown-menu">
						<li><a>Notice</a></li>
						<li><a>Q & A</a></li>
						<li><a>Review</a></li>
					</ul>
				</li>
				<li><a>testtesttest</a></li>
			</ul>
			<ul class="nav navbar-nav pull-right">
				<li class=""><a href="/">Join</a></li>
				<li class=""><a href="/">login</a></li>
				<li class=""><a href="/">etc</a></li>
			</ul>
		</div>
	</div>
</div>
<div id="container" class="container-fluid">
	<div>asd123</div>
	<div class="panel-group">
		<div class="panel panel-default pull-left" style="width:30%">
			<div class="panel-heading">
				<div class="panel-title">title</div>
			</div>
			<div class="panel-body">body
				<div class="list-group">
					<div class="list-group-item">item1</div>
					<div class="list-group-item">item2</div>
				</div>
				<table class="table table-responsive">
					<tr>
						<td>td1</td>
						<td>td2</td>
					</tr>
					<tr>
						<td>td3</td>
						<td>td4</td>
					</tr>
				</table>
			</div>
			<div class="panel-footer">footer</div>
		</div>
		<div class="panel panel-default pull-left" style="width:30%">
			<div class="panel-heading">
				<div class="panel-title">title</div>
			</div>
			<div class="panel-body">body
				<div class="list-group pull-left">
					<div class="list-group-item">item1</div>
					<div class="list-group-item">item2</div>
				</div>
				<table class="table table-responsive">
					<tr>
						<td>td1</td>
						<td>td2</td>
					</tr>
					<tr>
						<td>td3</td>
						<td>td4</td>
					</tr>
				</table>
			</div>
			<div class="panel-footer">footer</div>
		</div>
		<div class="panel panel-default pull-left" style="width:30%">
			<div class="panel-heading">
				<div class="panel-title">title</div>
			</div>
			<div class="panel-body">body
				<div class="list-group">
					<div class="list-group-item">item1</div>
					<div class="list-group-item">item2</div>
				</div>
				<table class="table table-responsive">
					<tr>
						<td>td1</td>
						<td>td2</td>
					</tr>
					<tr>
						<td>td3</td>
						<td>td4</td>
					</tr>
				</table>
			</div>
			<div class="panel-footer">footer</div>
		</div>
	</div>
	<div class="well well-sm">abcd</div>
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
