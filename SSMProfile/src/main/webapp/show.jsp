<%@ page  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html">
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px">
    	<tr>
        	<td>编号</td>
            <td style="width:150px">${sessionScope.pro.id }</td>
        </tr>
        <tr>
        	<td>姓名</td>
            <td style="width:150px">${sessionScope.pro.name }</td>
        </tr>
        <tr>
        	<td>生日</td>
            <td style="width:150px">${sessionScope.pro.birthday }</td>
        </tr>
        <tr>
        	<td>性别</td>
            <td style="width:150px">${sessionScope.pro.gender }</td>
        </tr>
        <tr>
        	<td>职业</td>
            <td style="width:150px">${sessionScope.pro.career }</td>
        </tr>
        <tr>
        	<td>住所</td>
            <td style="width:150px">${sessionScope.pro.address }</td>
        </tr>
        <tr>
        	<td>电话</td>
            <td style="width:150px">${sessionScope.pro.mobile }</td>
        </tr>
       
    </table>
    <a href="User_Result.action"><input type="button" value="返回"/></a>
</body>
</html>