<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/27/2021
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new product</h1>

<p>
    <c:if test='${pr != null}'>
        <span class="message">${pr}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to product list</a>
</p>
<form  action="/product" method="post">
    <fieldset>
        <legend>product information</legend>
        <table>
            <tr>
                <td>Id: </td>
                <td><input type="text" name="id" id="id"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="origin" id="origin"></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Create product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
