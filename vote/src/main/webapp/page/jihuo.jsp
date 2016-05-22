<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<base href="/vote/">
<meta content="charset=utf-8">
<title>激活</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<style>
	#register dl dd .input-buttons { background:url(images/button_submit.gif); width:78px; height:30px; }
	
</style>
<body>
<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="search">
	<!--  
		<form method="get" action="index.html">
			<input type="text" name="keywords" class="input-text" /><input type="submit" name="submit" class="input-button" value="" />
		</form>
	-->	
	</div>
</div>
<div id="register" class="box">
	<h2>账户激活</h2>
	<div class="content">
		<label style="color:green;">请输入您有效的用户信息</label>
	   <form method="post" action="user_jihuo">
			<dl>
				<dt>用户名：</dt>
				<dd><input type="text" class="input-text" name="vuusername" value=""/></dd>
				<dt>密码：</dt>
				<dd><input type="password" class="input-text" name="vupassword" value=""/></dd>
				<dt>电子邮箱：</dt>
				<dd><input type="text" class="input-text" name="vuemail" value=""/></dd>
				<dt></dt>
				<dd><input type="submit" class="input-buttons" name="submit" value="" /></dd>
			</dl>
		</form>
		<div class="error" style="color:red;">${sessionScope.jihuoMsg }</div>
		<c:remove var="jihuoMsg" scope="session"/> <!-- 清除session中的数据 -->
		<div class="error"></div>
	</div>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>