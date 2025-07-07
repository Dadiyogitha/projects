<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Order Details</title>
</head>
<body>
<h2>Order #${order.orderId}</h2>

<p><strong>Status:</strong> ${order.status}</p>
<p><strong>Order Date:</strong> ${order.orderedOn}</p>

<h3>Shipping Address</h3>
<p>
    ${order.address.address1},<br>
    ${order.address.city}, ${order.address.state},<br>
    ${order.address.country} - ${order.address.pincode}
</p>

<h3>Order Items</h3>
<table border="1">
    <tr>
        <th>Product</th>
        <th>Quantity</th>
        <th>Price</th>
    </tr>
    <c:forEach var="item" items="${order.orderedItems}">
        <tr>
            <td>${item.product.productName}</td>
            <td>${item.quantity}</td>
            <td>${item.price}</td>
        </tr>
    </c:forEach>
</table>

<a href="/user/profile">Back to Profile</a>
</body>
</html>