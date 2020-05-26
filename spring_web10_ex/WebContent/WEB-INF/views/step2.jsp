<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step2.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			/* console.log($("#id").val());
			console.log($("#pwd").val());
			console.log($("#confirm").val());
			console.log($("#email").val()); 
			
			유효성 검사 수행... */
			
			document.frm.action = "<c:url value='../register/step3.do'></c:url>";
			document.frm.method = "get";
			document.frm.submit();
			
			
		});
	});
</script>
</head>
<body>
	<h2>step2.jsp</h2>
	<h2>잘 넘어오나???</h2>
	<form name="frm">
		<table>
			<tr>
				<th>ID</th>
				<td><input type="text" name="id" id="id" /></td>
			</tr>
			<tr>
				<th>PW</th>
				<td><input type="password" name="pwd" id="pwd" /></td>
			</tr>
			<tr>
				<th>Confirm</th>
				<td><input type="password" name="confirm" id="confirm" /></td>
			</tr>
			<tr>
				<th>EMAIL</th>
				<td><input type="email" name="email" id="email" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="button" value="가입" id="btn" />
				<input type="button" value="되돌아가기" onclick="javascript:history.back()" />
				</td>
			</tr>
		</table>
	
	</form>
</body>
</html>