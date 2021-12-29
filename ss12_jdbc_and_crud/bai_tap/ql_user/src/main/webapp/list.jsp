<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/28/2021
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<table class="table table-dark">
    <thead>
    <tr class="table-active">
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach  items="${userone}" var="u" varStatus="loop">
    <tr>
        <td>${loop.count}"</td>
        <td>${u.name}</td>
        <td>${u.email}</td>
        <td>${u.country}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>

<nav class="navbar navbar-light bg-light">
    <div class="container-fluid">
        <form class="d-flex" action="/user">
            <input class="form-control me-2" type="search" placeholder="Search name user" aria-label="Search" name="search">
            <button name="actionUser" class="btn btn-outline-success" type="submit" value="search">Search</button>
        </form>
    </div>
</nav>

<form action="/user?actionUser=sort" >
    <input type="hidden" name="actionUser" value="sort">
    <button class="btn btn-primary" type="submit">Sort</button>
</form>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
