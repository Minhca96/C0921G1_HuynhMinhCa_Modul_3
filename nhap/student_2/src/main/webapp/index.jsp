<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/26/2021
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  </head>
  <body>
  <!-- On tables -->

  <table class="table-success">

    <!-- On cells (`td` or `th`) -->
    <tr>
      <td class="table-primary">ID</td>
      <td class="table-secondary">Name</td>
      <td class="table-success">Age</td>

    </tr>
    <c:forEach var="ca" items="${st}">
      <tr>
        <td class="table-primary">${ca.id}</td>
        <td class="table-secondary">${ca.name}</td>
        <td class="table-success">${ca.age}</td>

      </tr>
    </c:forEach>
  </table>


  <!-- On rows -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  </body>
</html>
