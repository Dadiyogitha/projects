<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/product/saveProduct" method="post" enctype="multipart/form-data">
    Description: <input type="text" name="description"><br>
    Image: <input type="file" name="imageFile"><br>
    Price: <input type="text" name="price"><br>
    Product Name: <input type="text" name="productname"><br>
    <input type="submit" value="Add Product">
</form>
</body>
</html>