<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/24/2021
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currenci Conveter</title>
    <link rel="stylesheet" href="css/bootstrap.css">
  </head>
  <body>
  <div class="container-fluid" >
    <div class="row">
      <div class="col-lg-12 text-lg-center " >
        <h4>Currenci Conveter</h4>
        <form action="converter.jsp" method="post">
          <span>Rate:</span><br>
          <input type="text" name="rate" placeholder="moi nhap so tien can doi" value="23000"><br>
          <span>USD:</span><br>
          <input type="text" name="usd" placeholder="moi nhap so tien can doi" value="1"><br>
          <input type="submit" id="submit" value="converter">
        </form>
      </div>
    </div>

  </div>
  <script src="js/bootstrap.js"></script>
  </body>
</html>
