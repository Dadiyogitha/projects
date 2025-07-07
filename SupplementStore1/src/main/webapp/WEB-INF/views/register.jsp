<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <style>
        body { font-family: Arial; background: #f2f2f2; padding: 20px; }
        form { background: #fff; padding: 20px; width: 400px; margin: auto; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }
        input[type="text"], input[type="email"], input[type="password"] {
            width: 100%; padding: 10px; margin: 10px 0; box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50; color: white; padding: 10px 15px;
            border: none; cursor: pointer; width: 100%;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<h2 style="text-align:center;">Register User</h2>

<!-- Display error or success messages -->
<c:if test="${not empty error}">
    <div style="color:red; text-align:center;">${error}</div>
</c:if>
<c:if test="${not empty success}">
    <div style="color:green; text-align:center;">${success}</div>
</c:if>

<form action="/store/register" method="post">
    <label for="email">Email:</label>
    <input type="email" name="email" required>
    <label for="firstName">First Name:</label>
    <input type="text" name="firstname" required>
    <label for="lastName">Last Name:</label>
    <input type="text" name="lastname" required>
    <label for="password">Password:</label>
    <input type="password" name="password" required>
    <label for="phno">Phone Number:</label>
    <input type="text" name="phno" required>
    <label for="username">Username:</label>
    <input type="text" name="username" required>

    

    <input type="submit" value="Register">
    
    <p>Already have an account? <a href="login">Login</a></p>
</form>

</body>
</html>