<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
  <c:if test="${not empty success}">
  ${success}
  </c:if>
   <c:if test="${not empty failure}">
  ${failure}
  </c:if>
  
  
  
  
  <form action="registeruser" method="post">
		name<input type="text" id="name" name="name"><br> <br>
		password<input type="text" id="password" name="password"><br> <br>
		<input type="submit" value="register">
	</form>
</body>
</html>