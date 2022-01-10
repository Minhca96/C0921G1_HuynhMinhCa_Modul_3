<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/30/2021
  Time: 1:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form action="/product?action=create" method="post">
<div class="container-fluid">
    <div class="row">
        <div class="rol-lg-12">
            Name: <input type="text" name="name" >
        </div>
    </div>

    <div class="row">
        <div class="rol-lg-12">
           Price: <input type="text" name="price" >
        </div>
    </div>

    <div class="row">
        <div class="rol-lg-12">
            Origin:<input type="text" name="origin" >
        </div>
    </div>

    <input type="submit" value="submit" >
</div>
</form>
</body>
</html>
