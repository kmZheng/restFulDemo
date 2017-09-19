<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>显示所有课程</title>
</head>
<body>

	<h3>课程列表如下：</h3>

	<table border="1">
		<tr>
			<td>课程编号</td>
			<td>课程名称</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${TclassListFromServer}" var="tclass">
			<tr>
				<td>${tclass.classId }</td>
				<td>${tclass.className }</td>
				<td>
					<%-- <form
						action="${pageContext.request.contextPath }/tclass/cla/${tclass.classId}"
						method="POST">
						<input type="hidden" name="_method" value="DELETE"> 
						<input type="submit" value="delete" onclick="return confirm('是否删除')">
					</form> --%>
					
					<form action="${pageContext.request.contextPath }/tclass/cla/${tclass.classId}"
						method="POST">
						<input type="hidden" name="_method" value="DELETE"> 
						<a	class="mya" href="javascript:void(0);">delete</a>
					</form> 
					
					<a href="${pageContext.request.contextPath }/tclass/cla/${tclass.classId}">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<br />
	<a href="${pageContext.request.contextPath }/tclass/saveinit">增加课程</a>
	<br />
	<br />
	<form action="${pageContext.request.contextPath }/tclass/cla" method="post" onsubmit="false">
		PID:<input type="number" name="classId" id="classId">
		 
		<a id="findById" href="javascript:void(0);">精确查询</a>	
	</form>
	<br />
	<br />
	<form action="${pageContext.request.contextPath }/tclass/findbyname" method="post" onsubmit="false">
		课程名称:<input type="text" name="className" value="a"> 
		
		<!-- <a id="findByName" href="javascript:void(0);">模糊查询</a>	 -->
		<input type="submit" value="模糊查询"> 
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
		findbyidNode.onclick = function(){
			var queryNum = document.getElementById("classId").value;
			var formNode = this.parentNode;
			formNode.action = formNode.action+"/"+queryNum;
			formNode.submit();
		}
		
		
	</script>
</body>
</html>