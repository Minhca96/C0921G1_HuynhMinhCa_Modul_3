<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/23/2021
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/product" >
    <span> Mô tả của sản phẩm :</span><input type="text" name="ProductDescription">
    <span> Giá niêm yết của sản phẩm</span><input type="text" name="ListPrice">
    <span>Tỷ lệ chiết khấu (phần trăm)</span><input type="text" name="DiscountPercent"><br>
    <input type="submit" value=" xem kết quả">
  </form>
  <h2>
    ket qua: ${CalculateDiscount}
  </h2>
  </body>
</html>
