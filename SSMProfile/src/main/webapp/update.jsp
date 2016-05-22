<%@ page  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html">
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

</head>
<body>
<form action="User_UptPro" method="post" style="text-align:center;margin:80px auto;width:360px;">
	<table border="1px">
    	<tr>
        	<td>编号</td>
            <td style="width:150px"><input name="id" value="${sessionScope.pro.id }" readonly="readonly"/></td>
        </tr>
        <tr>
        	<td>姓名</td>
            <td style="width:150px"><input name="name" value="${sessionScope.pro.name}"/></td>
        </tr>
        <tr>
        	<td>生日</td>
            <td style="width:150px"><input name="birthday" value="${sessionScope.pro.birthday }"/></td>
        </tr>
        <tr>
        	<td>性别</td>
            <td style="width:150px">
            	<select id="sel" name="gender">
            		<option value="男">男</option>
            		<option value="女">女</option>
           		</select>
            </td>
        </tr>
        <tr>
        	<td>职业</td>
            <td style="width:150px"><input name="career" value="${sessionScope.pro.career }"/></td>
        </tr>
        <tr>
        	<td>住所</td>
            <td style="width:150px"><input name="address" value="${sessionScope.pro.address }"/></td>
        </tr>
        <tr>
        	<td>电话</td>
            <td style="width:150px"><input name="mobile" value="${sessionScope.pro.mobile }"/></td>
        </tr>
       
    </table>
    <input type="submit" value="修改"/>
   </form>
    <a href="User_Result.action"><input type="button" value="返回"/></a>
</body>
</html>