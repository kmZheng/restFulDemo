<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>新增课程</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/tclass/cla"
		method="post">
		<table>
			<tr>
				<td>学生姓名</td>
				<td><input type="text" name="className" value="java"></td>
			</tr>
			<tr>
				<td><input type="submit" value="保存"></td>
				<td><input type="reset" value="重置" /></td>
			</tr>
		</table>

	</form>
</body>
</html>