<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Amazon-style Product Listing</title>

    <!-- ✅ Bootstrap CDN -->
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-MD2Z8+TfIm3Qp3E5qZboibX/NwG6t9QqO4sNfJqIu9h1KZ5bKMQbKJ4AzoYFlL6F"
          crossorigin="anonymous">

    <style>
       
        .product-card {
            margin-bottom: 30px;
        }
    </style>
<body>
    <h2>Welcome to Your Dashboard</h2>

    
        <p>Hello, <strong>${loggedinUser.firstName} ${loggedinUser.lastName}</strong>!</p>
        
        List Of Products: ${productList.get(0).productName} ${productList.size() }
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>List of Products (${productList.size()} items)</h2>


<h2>Products (${products.size()})</h2>

<style>
  .product-container {
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    margin-top: 20px;
  }
  .product-card {
    flex: 1 1 250px;
    border: 1px solid #ccc;
    padding: 15px;
    text-align: center;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
  }
  .product-img {
    width: 100%;
    height: 250px;
    object-fit: contain;
    margin-bottom: 10px;
    border-radius: 6px;
  }
  .product-title {
    font-size: 18px;
    font-weight: bold;
  }
  .product-price {
    font-size: 16px;
    color: green;
    margin-top: 5px;
  }
</style>

<div class="product-container">
  <c:forEach var="product" items="${productList}">
    <div class="product-card">
      <img src="${product.image}" alt="${product.productName}" class="product-img" />
      <div class="product-title">${product.productName}</div>
      <p>${product.description}</p>
      <div class="product-price">₹ ${product.price}</div>
    </div>
  </c:forEach>
</div>


<h2>Products (${productList.size()})</h2>
<div>
  <c:forEach var="product" items="${productList}">
    <div class="product-card">
      <img src="${pageContext.request.contextPath}/images/${product.image}" class="product-img" />
      <h3>${product.productName}</h3>
      <p>${product.description}</p>
      <strong>₹ ${product.price}</strong>
    </div>
  </c:forEach>
</div>

    <hr>
    <a href="logout">Logout</a>
    

</body>
</html>
