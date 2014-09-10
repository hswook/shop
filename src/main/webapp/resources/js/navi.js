jQuery(document).ready(function() {
	$(".nav li").hover( function() {
		$(this).addClass("open");
	}, function() {
		$(this).removeClass("open");
	});
});