<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/27/2021
  Time: 10:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<%--  <form action="">--%>
    <table border="1">
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Delete</th>
      </tr>
      <c:forEach var="st" items="${student}">
      <tr>
        <td>${st.id}</td>
        <td>${st.name}</td>
        <td>${st.age}</td>
        <td>delete</td>
      </tr>
      </c:forEach>
    </table>
    <button><a href="/st?actionUser=add">Add</a> </button>


<%--  </form>--%>
  </body>
</html>
