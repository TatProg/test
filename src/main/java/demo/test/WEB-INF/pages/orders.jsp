<%--
  Created by IntelliJ IDEA.
  User: tatprog
  Date: 20/02/2020
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Test Title</title>
</head>
<body>
    <a href="../../index.jsp">Back to main menu</a>

    <br/>
    <br/>

    <h1>Book List</h1>

    <c:if test="${!empty listOrders}">
        <table>
            <tr>
                <th width="100">orderID</th>
                <th width="100">productID</th>
                <th width="100">customerID</th>
                <th width="80">Edit</th>
                <th width="80">Delete</th>
            </tr>
            <c:forEach items="${listOrders}" var="order">
                <tr>
                    <td>${order.id}</td>
                    <td><a href="/orderdata/${order.id}" target="_blank">${order.orderID}</a></td>
                    <td>${order.price/100}${order.price%100}</td>
                    <td><a href="<c:url value='/edit/${order.id}'/>">Edit</a></td>
                    <td><a href="<c:url value='/remove/${order.id}'/>">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>


    <h1>Add a Book</h1>

    <c:url var="addAction" value="/books/add"/>

<%--    <form:form action="${addAction}" commandName="order">--%>
<%--        <table>--%>
<%--            <c:if test="${!empty order.bookTitle}">--%>
<%--                <tr>--%>
<%--                    <td>--%>
<%--                        <form:label path="id">--%>
<%--                            <spring:message text="ID"/>--%>
<%--                        </form:label>--%>
<%--                    </td>--%>
<%--                    <td>--%>
<%--                        <form:input path="id" readonly="true" size="8" disabled="true"/>--%>
<%--                        <form:hidden path="id"/>--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--            </c:if>--%>
<%--            <tr>--%>
<%--                <td>--%>
<%--                    <form:label path="bookTitle">--%>
<%--                        <spring:message text="Title"/>--%>
<%--                    </form:label>--%>
<%--                </td>--%>
<%--                <td>--%>
<%--                    <form:input path="bookTitle"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>--%>
<%--                    <form:label path="bookAuthor">--%>
<%--                        <spring:message text="Author"/>--%>
<%--                    </form:label>--%>
<%--                </td>--%>
<%--                <td>--%>
<%--                    <form:input path="bookAuthor"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>--%>
<%--                    <form:label path="price">--%>
<%--                        <spring:message text="Price"/>--%>
<%--                    </form:label>--%>
<%--                </td>--%>
<%--                <td>--%>
<%--                    <form:input path="price"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td colspan="2">--%>
<%--                    <c:if test="${!empty book.bookTitle}">--%>
<%--                        <input type="submit"--%>
<%--                               value="<spring:message text="Edit Book"/>"/>--%>
<%--                    </c:if>--%>
<%--                    <c:if test="${empty book.bookTitle}">--%>
<%--                        <input type="submit"--%>
<%--                               value="<spring:message text="Add Book"/>"/>--%>
<%--                    </c:if>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--        </table>--%>
<%--    </form:form>--%>
</body>
</html>
