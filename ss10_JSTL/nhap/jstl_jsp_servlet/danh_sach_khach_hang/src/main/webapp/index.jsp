<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/25/2021
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <table>
      <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
        <th>School</th>
        <th>Images</th>
      </tr>
      <c:forEach var="listKHObj" items="${listKH}" varStatus="Loop">
        <tr>
          <th>${listKHObj.name}</th>
          <th>${listKHObj.age}</th>
          <th>${listKHObj.address}</th>
          <th>${listKHObj.school}</th>
          <th><img src="${listKHObj.images}" width="320px" height="240px" alt=""></th>
        </tr>
      </c:forEach>

    </table>

  </body>
</html>
