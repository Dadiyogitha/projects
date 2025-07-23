<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Login</h2>
<c:if test="${not empty loginFailure}">
  <div style="color:red">${loginFailure}</div>
</c:if>
<form action="loginaction" method="post">
   Name: <input type="text" name="name" /><br><br>
Password: <input type="password" name="password" /><br><br>
   <input type="submit" value="Login"/>
</form>
</body>
</html>