<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>学生数据更新</title>
</head>
<body>
	
	<form action="${pageContext.request.contextPath }/tstudent/stu"
		method="post">
		<input type="hidden" name="_method" value="PUT">
		<table>
			<tr>
				<td>学号</td>
				<td>${TstudentFromServer.studentId}
				<!-- 隐藏域 -->
				<input type="hidden" name="studentId" value="${TstudentFromServer.studentId}"></td>
			</tr>
			<tr>
				<td>学生姓名</td>
				<td><input type="text" name="studentName" value="${TstudentFromServer.studentName}"></td>
			</tr>
			<tr>
				<td>出生年月</td>
				<td><input type="date" name="birthday" value="${TstudentFromServer.birthday}"></td>
			</tr>
			<tr>
				<td>户籍地</td>
				<td><input type="text" name="region" value="${TstudentFromServer.region}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="更新"></td>
				<td><input type="reset" value="重置" /></td>
			</tr>
		</table>

	</form>
</body>
</html>