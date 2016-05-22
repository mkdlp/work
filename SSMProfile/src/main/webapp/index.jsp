<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html">
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<script>
	window.onload=function(){
		window.href="User_Result.action";
	}
</script>
</head>
<body>
	<table border="1px">
		<tr>
			<th style="width: 50px; height: 20px; background: #F90">编号</th>
			<th style="width: 100px; height: 20px; background: #F90">姓名</th>
			<th style="width: 100px; height: 20px; background: #F90">生日</th>
			<th style="width: 100px; height: 20px; background: #F90">性别</th>
			<th style="width: 100px; height: 20px; background: #F90">职业</th>
			<th style="width: 150px; height: 20px; background: #F90">住址</th>
			<th style="width: 150px; height: 20px; background: #F90">电话</th>
			<th style="width: 110px; height: 20px; background: #F90">操作</th>
		</tr>
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.id }</td>
				<td>${item.name }</td>
				<td>${item.birthday }</td>
				<td>${item.gender }</td>
				<td>${item.career }</td>
				<td>${item.address }</td>
				<td>${item.mobile }</td>
				<td>
					<a href="User_Show.action?id=${item.id }"><input type="button" name="show" value="明细"></a>
					<a href="User_Update.action?id=${item.id }"><input type="button" name="show" value="修改"></a>
				</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>