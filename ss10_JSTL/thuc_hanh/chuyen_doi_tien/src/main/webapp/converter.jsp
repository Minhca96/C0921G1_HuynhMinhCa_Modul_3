<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/24/2021
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%  
int rate= Integer.parseInt(request.getParameter("rate"));
int usd= Integer.parseInt(request.getParameter("usd"));
int vnd= rate * usd;

%>
    <h1>Rate: <%=rate %></h1>;
    <h1>USD: <%=usd%></h1>;
    <h1>VND: <%=vnd%></h1>
</body>
</html>
