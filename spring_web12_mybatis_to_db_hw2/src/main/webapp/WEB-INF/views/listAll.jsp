<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>listAll.jsp</title>
</head>
<body>
	<h2>listAll.jsp</h2>
	<h2>사원 리스트</h2>
	<table>
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>급여정보</th>
			<th>부서번호</th>
		</tr>
		<c:forEach var="i" items="${list }">
		<tr>
			<td>${i.empno }</td>
			<td>${i.ename }</td>
			<td>${i.sal }</td>
			<td>${i.deptno }</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>