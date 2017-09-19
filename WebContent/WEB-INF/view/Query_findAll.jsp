<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>综合查询</title>
</head>
<body>

	<h1>Result</h1>
	<c:forEach items="${QueryListFromServer}" var="rep">
	${rep.classId }<br>
	${rep.studentName }<br>
	<h3>***************************************</h3>
	</c:forEach>
</body>
</html>