<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="saveProduct" method="post" enctype="multipart/form-data">
    Product Name: <input type="text" name="productName"><br>
    Description: <input type="text" name="description"><br>
    Price: <input type="text" name="price"><br>
    Image: <input type="file" name="imageFile"><br>
    <input type="submit" value="Add Product">
</form>
</body>
</html>