<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>显示所有学生</title>
</head>
<body>

	<h3>学生列表如下：</h3>

	<table border="1">
		<tr>
			<td>学号</td>
			<td>学生姓名</td>
			<td>出生年月</td>
			<td>户籍地</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${TstudentListFromServer}" var="student">
			<tr>
				<td>${student.studentId }</td>
				<td>${student.studentName }</td>
				<td>${student.birthday }</td>
				<td>${student.region }</td>
				<td>
					<%-- <form
						action="${pageContext.request.contextPath }/tstudent/stu/${student.studentId}"
						method="POST">
						<input type="hidden" name="_method" value="DELETE"> <input
							type="submit" value="delete" onclick="return confirm('是否删除')">
					</form> --%>

					<form
						action="${pageContext.request.contextPath }/tstudent/stu/${student.studentId}"
						method="POST">
						<input type="hidden" name="_method" value="DELETE"> <a
							class="mya" href="javascript:void(0);">delete</a>
					</form> <a
					href="${pageContext.request.contextPath }/tstudent/stu/${student.studentId}">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<br />
	<a href="${pageContext.request.contextPath }/tstudent/saveinit">增加学生</a>
	<br />
	<br />
	<form action="${pageContext.request.contextPath }/tstudent/stu"
		method="post" onsubmit="false">
		studentId:<input type="text" name="studentId" id="studentId">

		<a id="findById" href="javascript:void(0);">精确查询</a>
	</form>
	<br />
	<br />
	<form
		action="${pageContext.request.contextPath }/tstudent/findbyregion"
		method="post" onsubmit="false">
		户籍地:<input type="text" name="region" id="region"> <input
			type="submit" value="户籍地查询">
	</form>
	<script type="text/javascript">
		var myas = document.getElementsByClassName("mya");
		for (var i = 0; i < myas.length; i++) {
			myas[i].onclick = function() {
				var flag = confirm("是否确认删除？");
				if (flag) {
					this.parentNode.submit();
				}
			}
		}
		var findbyidNode = document.getElementById("findById");
		findbyidNode.onclick = function() {
			var queryNum = document.getElementById("studentId").value;
			var formNode = this.parentNode;
			formNode.action = formNode.action + "/" + queryNum;
			formNode.submit();
		}
	</script>
</body>
</html>