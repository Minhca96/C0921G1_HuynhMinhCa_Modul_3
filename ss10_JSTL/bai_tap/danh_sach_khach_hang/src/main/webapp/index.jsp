<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/24/2021
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <h3> Danh sach khach hang</h3>
    <table border="1">
    <tr>
      <th>Ten</th>
      <th>Ngay Sinh</th>
      <th>Dia chi</th>
      <th>Anh</th>
    </tr>

  <c:forEach var="KhachHangObj" items="${khachHang}" varStatus="Loop">
    <tr>

      <td>${KhachHangObj.name}</td>
      <td>${KhachHangObj.ngaySinh}</td>
      <td>${KhachHangObj.diaChi}</td>
      <td><img src="${KhachHangObj.anh}" style="width: 320px ; height: 160px"></td>
    </tr>
  </c:forEach>
  </table>
  </body>
</html>
