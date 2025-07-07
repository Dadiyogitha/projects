<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login Form</h2>
    
    <!-- Display error message if login failed -->
    <c:if test="${not empty error}">
        <div style="color:red;">${error}</div>
    </c:if>
    
    <form action="/store/authWithSpringData" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username" required />
        <br><br>

        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required />
        <br><br>

        <input type="submit" value="Login" />
    </form>
    <p>Don't have an account? <a href="/register">Sign up</a></p>
</body>
</html>

