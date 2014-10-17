<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>

<!DOCTYPE html>
<html lang="ko">
<head>
	<title>board</title>
	<c:if test="${!empty message }">
		<script type="text/javascript">alert('<c:out value='${message}' />')</script>
	</c:if>
	<script data-main="/resources/js/main" src="/resources/assets/lib/jquery/jquery-1.11.0.min.js"></script>
	<script data-main="/resources/js/main" src="/resources/js/util.js"></script>
	<script src="/resources/assets/lib/ckeditor/ckeditor.js"></script>
	<script type="text/javascript" src="/se2/js/HuskyEZCreator.js" charset="utf-8"></script>
	<link rel="stylesheet" href="/resources/assets/lib/bootstrap/css/bootstrap.css">
	<link rel="stylesheet" href="/resources/assets/lib/bootstrap/css/bootstrap-theme.css">
	<link rel="stylesheet" href="/resources/css/common.css">
	<link rel="stylesheet" href="/resources/css/navi.css">
	

	<script type="text/javascript">
		var oEditors = [];

		$(function() {
		 	nhn.husky.EZCreator.createInIFrame({
				oAppRef : oEditors,
				elPlaceHolder : "content",
				//SmartEditor2Skin.html 파일이 존재하는 경로
				sSkinURI : "/se2/SmartEditor2Skin.html",
				htParams : {
					// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
					bUseToolbar : true,
					// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
					bUseVerticalResizer : true,
					// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
					bUseModeChanger : true,
					fOnBeforeUnload : function() {

					}
				},
				fOnAppLoad : function() {
					//기존 저장된 내용의 text 내용을 에디터상에 뿌려주고자 할때 사용
					oEditors.getById["content"].exec("PASTE_HTML",
							[ "${boardPost.content}" ]);
				},
				fCreator : "createSEditor2"
			});
		 	
			$("#save").click(function(){
				oEditors.getById["content"].exec("UPDATE_CONTENTS_FIELD", []);
				$("#board").submit();
			});
	
		});
	</script>

</head>
<body>
<%@ include file="/WEB-INF/views/layout/top.jsp" %>

<div id="container" class="container container-fluid">

<h1>
	board
</h1>
	<form id="board" name="board" method="post">
		<fieldset>
			<legend>board form</legend>
			<span>title</span><input name="title" type="text" value="${boardPost.title }"><br />
			<span>content</span><br />
			<textarea id="content" name="content" rows="10" cols="100">
			</textarea>
			
			<input type="button" id="save" value="저장" />
		</fieldset>
	</form>
</div>
</body>
</html>