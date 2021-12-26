<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/25/2021
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>May Tinh</title>
  </head>
  <body>
  <form action="TinhServlet" method="post">

    <table>

      <tr>
        <th></th>
        <th>May Tinh</th>
      </tr>

      <tr>
        <td>so thu nhat</td>
        <td><input type="number" name="so_thu_nhat"></td>
      </tr>

      <tr>
        <td>phep tinh</td>
        <td><select name="phep_tinh" id="">
          <option value="+">+</option>
          <option value="-">-</option>
          <option value="*">*</option>
          <option value="/">/</option>
        </select></td>
      </tr>

      <tr>
        <td>so thu hai</td>
        <td><input type="number" name="so_thu_hai"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="ket_qua"></td>
      </tr>
    </table>
  </form>

  </body>
</html>
