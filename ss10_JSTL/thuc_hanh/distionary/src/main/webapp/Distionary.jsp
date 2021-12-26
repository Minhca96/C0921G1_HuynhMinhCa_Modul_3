<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/24/2021
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%! Map<String,String> dic= new HashMap<>();%>
<%
dic.put("hello","xin chao");
dic.put("how"," the nao");
dic.put("computer"," may tinh");
dic.put("book"," sach ");
dic.put("money"," tien");

    String search = request.getParameter("search");
    String result = dic.get(search);
    if (result != null) {
        out.println("Word: " + search);
        out.println("Result: " + result);
    } else {
        out.println("Not found");
    }
%>


</body>
</html>
