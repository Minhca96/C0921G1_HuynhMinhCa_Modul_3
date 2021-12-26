<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/25/2021
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<p>ket qua tra ve:</p>
<%=
request.getParameter("so_thu_nhat")+ request.getParameter("phep_tinh")+ request.getParameter("so_thu_hai")
+"="+ request.getAttribute("ket_qua")
%>
</body>
</html>
