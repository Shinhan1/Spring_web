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
		$("#bt").click(function(){
			document.frm.action = "survey.ok";
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
	<%-- <c:url value="/survey/survey.ok" /> --%>
	
	<h2>surveyForm.jsp</h2>
	
	<form action="#" name="frm">
		<img src="<c:url value='/images/image1.jpg' />" alt="문채원" />
		<input type="radio" name="rd" id="rd1" value="<c:url value='/images/image1.jpg' />" />
		<img src="<c:url value='/images/image2.jpg' />" alt="정채연" />
		<input type="radio" name="rd" id="rd2" value="<c:url value='/images/image2.jpg' />" />
		<input type="button" value="전송" id="bt" />
	</form>
	
</body>
</html>