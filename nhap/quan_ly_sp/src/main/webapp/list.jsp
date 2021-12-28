<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/27/2021
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


    <div>
      <table border="1">
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Origin</th>
        <th>delete</th>



      </tr>
      <c:forEach var="pr" items="${product}">
        <tr>
        <td>${pr.id}</td>
        <td>${pr.name}</td>
        <td>${pr.origin}</td>
          <td>delete</td>
      </tr>


      </c:forEach>

      </table>
    </div>

  <button><a href="/product?actionProduct=add">ADD NEW PRODUCT</a></button>

  </body>
</html>
