<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
</head>
		<body>
		    <h2>Product List</h2>
		    <table>
		        <tr>
		            <th>Product ID</th>
		            <th>Product Name</th>
		            <th>Product Price</th>
		            <th>Quantity</th>
		            <th>Discount</th>
		            <th>Action</th>
		        </tr>
		        <c:forEach items="${products}" var="product">
		            <tr>
		                <td>${product.productId}</td>
		                <td>${product.productName}</td>
		                <td>${product.productPrice}</td>
		                <td>${product.quantity}</td>
		                <td>${product.discount}</td>
		                <td><a href="/customer/addToCart/${product.productId}">Add to Cart</a></td>
		            </tr>
		        </c:forEach>
		    </table>
		</body>
		
</html>
