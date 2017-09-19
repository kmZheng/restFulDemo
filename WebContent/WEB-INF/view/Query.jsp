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
	<form action="${pageContext.request.contextPath }/report/rep" method="post" onsubmit="false">
		班级名称:<input type="text" name="className" id="className"><br/>
		户籍地:<input type="text" name="region" id="region">
		 
		<a id="findByQuery" href="javascript:void(0);">班级户籍地查询</a>
	</form>
	
	<script type="text/javascript">
		var findbyidNode = document.getElementById("findByQuery");
		findbyidNode.onclick = function(){
			var queryNum = document.getElementById("className").value;
			var queryNum1 = document.getElementById("region").value;
			var formNode = this.parentNode;
			formNode.action = formNode.action+"/"+queryNum+"/"+queryNum1;
			formNode.submit();
		} 
	</script>
</body>
</html>