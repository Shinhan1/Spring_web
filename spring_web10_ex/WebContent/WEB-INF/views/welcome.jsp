<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome.jsp</title>
</head>
<body>
	<h2>welcome.jsp</h2>
	<h2>가입해주셔서 감사합니다.</h2>
	<h2>가입 정보 확인</h2>
	<ul>
		<li>id : ${dto.id }</li>
		<li>pwd : ${dto.pwd }</li>
		<li>confirm : ${dto.confirm }</li>
		<li>email : ${dto.email }</li>
	</ul>
	
	<a href="../main"><span>[메인 화면으로 이동]</span></a>

</body>
</html>