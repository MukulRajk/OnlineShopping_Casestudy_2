<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bill</title>
</head>
<body>


    <h2>Your Bill</h2>
    <table>
        <tr>
            <th>Product Name</th>
            <th>Quantity</th>
            <th>Price</th>
        </tr>
        <c:forEach items="${cartItems}" var="item">
            <tr>
                <td>${item.product.productName}</td>
                <td>${item.quantity}</td>
                <td>${item.product.productPrice}</td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="2">Total:</td>
            <td>${totalAmount}</td>
        </tr>
    </table>
    <form action="/customer/payBill" method="post">
        <input type="submit" value="Pay">
    </form>


</body>
</html>
