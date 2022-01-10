<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/30/2021
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form action="">
<%--    <input type="hidden" name="action" value="create">--%>
    <a href="/product?action=add"> Them moi san pham </a>
<table class="table table-dark">
    <tbody>
    <tr class="table-active">
       <th>ID</th>
       <th>Name</th>
       <th>Price</th>
       <th>Origin</th>
    </tr>
    <c:forEach var="p" items="${list}">
    <tr>
        <td>${p.id}</td>
        <td>${p.name}</td>
        <td>${p.price}</td>
        <td>${p.origin}</td>
    </tr>
        </c:forEach>
    </tbody>
</table>
</form>
</body>
</html>
