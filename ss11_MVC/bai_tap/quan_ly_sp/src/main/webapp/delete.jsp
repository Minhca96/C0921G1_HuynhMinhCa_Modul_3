<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/27/2021
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="get">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>product information</legend>
        <table>

            <tr>
                <td>Id: </td>
                <td>${product.id}</td>
            </tr>
            <tr>
                <td>Name: </td>
                <td>${product.name}</td>
            </tr>
            <tr>
                <td>Origin: </td>
                <td>${product.origin}</td>
            </tr>


            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/products">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
    </form>
</body>
</html>
