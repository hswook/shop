
<div class="container">
	<div class="navbar navbar-default navbar-fixed-top breadcrumb" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand" href="/"><b>Shop</b></a>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="dropdown">
				<a id="menu1" role="button" data-toggle="dropdown" data-target="#" href="/">
				About Us <span class="caret"></span></a>
					<ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
						<li><a>About Us</a></li>
						<li><a>Brand Story</a></li>
						<li><a>Contact Us</a></li>
					</ul>
				</li>
				<li class="dropdown">
				<a id="menu2" role="button" data-toggle="dropdown" data-target="#" href="/product">
				Shopping <span class="caret"></span></a>
					<ul class="dropdown-menu" role="menu" aria-labelledby="menu2">
						<li><a href="/product/all">All</a></li>
						<li><a href="/product/t-shirt">T-Shirt</a></li>
						<li><a href="/product/outer">Outer</a></li>
						<li><a href="/product/knit">Knit</a></li>
						<li><a href="/product/food">Food</a></li>
						<li><a href="/product/living">Living</a></li>
					</ul>
				</li>
				<li class="dropdown">
				<a id="menu3" role="button" data-toggle="dropdown" data-target="#" href="/board">
				Board <span class="caret"></span></a>
					<ul class="dropdown-menu" role="menu" aria-labelledby="menu3">
						<li><a href="/board/1/2">Notice</a></li>
						<li><a href="/board/1/3">Q &amp; A</a></li>
						<li><a>Review</a></li>
					</ul>
				</li>
			</ul>
			<ul class="nav navbar-nav pull-right">
				<%
					if (request.getSession().getAttribute("member") != null) {
				%>
						<li class=""><a href="/order/cart">Cart</a></li>
						<li class=""><a href="/order/purchase">Purchase</a></li>
						<li class=""><a href="/order/wishlist">Wishlist</a></li>
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