
<div class="container">
	<div class="navbar navbar-default navbar-fixed-top breadcrumb" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand" href="/"><b>Shop</b></a>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class=""><a href="/">About Us</a>
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
				<li class=""><a href="/board">Board</a>
					<ul class="dropdown-menu">
						<li><a href="/board/1/2">Notice</a></li>
						<li><a href="/board/1/3">Q & A</a></li>
						<li><a>Review</a></li>
					</ul>
				</li>
			</ul>
			<ul class="nav navbar-nav pull-right">
				<%
					if (request.getSession().getAttribute("member") != null) {
				%>
						<li class=""><a href="/member/logout">Logout</a></li>
				<%
					} else {
				%>
						<li class=""><a href="/member/join">Join</a></li>
						<li class=""><a href="/member/login">Login</a></li>
				<%} %>
				<li class=""><a href="#link">etc</a></li>
			</ul>
		</div>
	</div>
</div>