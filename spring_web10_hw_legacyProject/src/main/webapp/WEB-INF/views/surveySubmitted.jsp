<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>surveySubmitted.jsp</title>
<style type="text/css">
	img {
		width: 500px;
		height: 500px;
	}
</style>
</head>
<body>
	<h2>surveySubmitted.jsp</h2>
	<h2>설문에 응해주셔서 감사합니다.</h2>
	<c:forEach var="img" items="${img }">
		<img src="<c:url value='/resources/${img }.jpg'></c:url>" alt="" />
	
	</c:forEach>
	
	
	
</body>
</html>