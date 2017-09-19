<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>新增学生</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/tstudent/stu"
		method="post">
		<table>
			<tr>
				<td>学生姓名</td>
				<td><input type="text" name="studentName" value="WWW"></td>
			</tr>
			<tr>
				<td>出生年月</td>
				<td><input type="date" name="birthday"></td>
			</tr>
			<tr>
				<td>户籍地</td>
				<td><input type="text" name="region" value="LN"></td>
			</tr>
			<tr>
				<td><input type="submit" value="保存"></td>
				<td><input type="reset" value="重置" /></td>
			</tr>
		</table>

	</form>
</body>
</html>