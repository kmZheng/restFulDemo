<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>课程数据更新</title>
</head>
<body>
	
	<form action="${pageContext.request.contextPath }/tclass/cla"
		method="post">
		<input type="hidden" name="_method" value="PUT">
		<table>
			<tr>
				<td>课程编号</td>
				<td>${TclassFromServer.classId}
				<!-- 隐藏域 -->
				<input type="hidden" name="classId" value="${TclassFromServer.classId}"></td>
			</tr>
			<tr>
				<td>课程名称</td>
				<td><input type="text" name="className" value="${TclassFromServer.className}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="更新"></td>
				<td><input type="reset" value="重置" /></td>
			</tr>
		</table>

	</form>
</body>
</html>