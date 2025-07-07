<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
<h2>User Profile</h2>

<div style="float:left; width:30%">
    <h3>User Information</h3>
    <p>Name: ${user.firstName} ${user.lastName}</p>
    <p>Email: ${user.email}</p>
    <p>Phone: ${user.phno}</p>
    <a href="/user/profile/edit">Edit Profile</a>
    
    <h3>Addresses</h3>
    <ul>
        <c:forEach var="address" items="${addresses}">
            <li>
                ${address.address1}, ${address.city}, ${address.state}, ${address.country} - ${address.pincode}
            </li>
        </c:forEach>
    </ul>
</div>

<div style="float:left; width:65%; padding-left:20px">
    <h3>Shopping Cart</h3>
    <table border="1">
        <tr>
            <th>Product</th>
            <th>Quantity</th>
            <th>Added On</th>
        </tr>
        <c:forEach var="item" items="${cartItems}">
            <tr>
                <td>${item.product.productName}</td>
                <td>${item.quantity}</td>
                <td>${item.addedAt}</td>
            </tr>
        </c:forEach>
    </table>

    <h3>Order History</h3>
    <table border="1">
        <tr>
            <th>Order ID</th>
            <th>Date</th>
            <th>Status</th>
            <th>Details</th>
        </tr>
        <c:forEach var="order" items="${orders}">
            <tr>
                <td>${order.orderId}</td>
                <td>${order.orderedOn}</td>
                <td>${order.status}</td>
                <td><a href="/orders/${order.orderId}">View</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>