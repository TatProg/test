<%--
  Created by IntelliJ IDEA.
  User: tatprog
  Date: 20/02/2020
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<title>OrderData</title>

<h1>Order Details</h1>

<table>
    <tr>
        <th width="100">orderID</th>
        <th width="100">productID</th>
        <th width="100">customerID</th>
    </tr>
    <tr>
        <td>${book.orderID}</td>
        <td>${book.productID}</td>
        <td>${book.customerID}</td>
    </tr>
</table>
</body>
</html>
