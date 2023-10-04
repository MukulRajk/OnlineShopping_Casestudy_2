<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Cart</title>
</head>
<body>
    <h2>Your Cart</h2>
    <table>
        <tr>
            <th>Product Name</th>
            <th>Quantity</th>
            <th>Price</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${cartItems}" var="item">
            <tr>
                <td>${item.product.productName}</td>
                <td>${item.quantity}</td>
                <td>${item.product.productPrice}</td>
                <td><a href="/customer/removeFromCart/${item.cartItemId}">Remove</a></td>
            </tr>
        </c:forEach>
    </table>
    <a href="/customer/payBill">Pay Bill</a>
</body>
</html>
