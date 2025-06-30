<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Dashboard</title>
</head>
<body>
    <h2>Welcome to Your Dashboard</h2>

    <c:if test="${not empty user}">
        <p>Hello, <strong>${user.firstName} ${user.lastName}</strong>!</p>
        <p>Email: ${user.email}</p>
        <p>Phone: ${user.phno}</p>
        <p>Username: ${user.username}</p>
    </c:if>

    <hr>
    <a href="logout">Logout</a>
    
    
    <form action="saveProduct" method="post" enctype="multipart/form-data">
    Product Name: <input type="text" name="productName"><br>
    Description: <input type="text" name="description"><br>
    Price: <input type="text" name="price"><br>
    Image: <input type="file" name="imageFile"><br>
    <input type="submit" value="Add Product">
</form>
</body>
</html>
