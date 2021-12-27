<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/27/2021
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/customers?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Origin</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${products}' var="pr">
        <tr>
            <td><a href="/product?actionUser=view&id=${pr.getId()}">${pr.getName()}</a></td>
            <td>${pr.id}</td>
            <td>${pr.name}</td>
            <td>${pr.origin}</td>
            <td><a href="/product?actionUser=edit&id=${pr.getId()}">edit</a></td>
            <td><a href="/product?actionUser=delete&id=${pr.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</body>
</html>
