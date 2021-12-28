<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/27/2021
  Time: 11:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/st?actionUser=add1" method="post">
    nhap id:<input type="number" name="id"><br>
    nhap name: <input type="text" name=" name"> <br>
    nhap age: <input type="text" name="age">
    <input type="submit" value="submit">
</form>
</body>
</html>
