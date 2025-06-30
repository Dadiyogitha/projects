<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Products</h2>
    <table border="1">
        <tr>
            <th>Product Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Image</th>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.productName}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
                <td><img src="/path/to/images/${product.image}" width="100" height="100"></td>
            </tr>
        </c:forEach>
    </table>
    <a href="/addProduct">Add Product</a>
</body>
</html>