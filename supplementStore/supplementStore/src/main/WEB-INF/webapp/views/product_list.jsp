<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h2>Product List</h2>
<a href="/admin/products/add">Add New Product</a><br/>
<table border="1">
    <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Description</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.productId}</td>
            <td>${product.productName}</td>
            <td>${product.description}</td>
            <td>
                <a href="/admin/products/edit/${product