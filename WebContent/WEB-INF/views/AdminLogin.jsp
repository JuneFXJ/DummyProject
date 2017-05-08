<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrator Login</title>
<!-- <style type="text/css">@import url("/css/boostrap.css");</style> -->
<style type="text/css">@import url("https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css");</style>
</head>
<body>
	<h1>Administrator Login</h1>
	<form class="form" action="admin_login.do" method="POST">
		<div class="form-group">
			<label>Account</label>
			<input type="text" name="account">
		</div>
		<div class="form-group">
			<label>Password</label>
			<input type="password" name="password">
		</div>
		<input type="submit" value="Login" class="btn btn-lg btn-info">
	</form>
</body>
</html>