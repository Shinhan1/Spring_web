<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>surveyForm.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			document.frm.action = "<c:url value='/survey/survey.ok'></c:url>";
			document.frm.submit();
		});
	});
</script>
<style type="text/css">
	img {
		width: 500px;
		height: 500px;
	}
</style>
</head>
<body>

	<h2>surveyForm.jsp</h2>
	<h2>좋아하는 사람은?</h2>
	<form action="#" name="frm">
		<div>
			<input type="checkbox" name="ck" id="" value="image1" />
			<img src="<c:url value='/resources/image1.jpg'></c:url>" alt="문채원" />
		</div>
		<div>
			<input type="checkbox" name="ck" id="" value="image2" />
			<img src="<c:url value='/resources/image2.jpg'></c:url>" alt="정채연" />
		</div>
		&nbsp;&nbsp;&nbsp;
		
		<input type="button" value="선택" id="btn" />
	
	</form>
	
</body>
</html>