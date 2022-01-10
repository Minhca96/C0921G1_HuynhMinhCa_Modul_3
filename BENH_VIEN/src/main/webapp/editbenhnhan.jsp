<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 1/6/2022
  Time: 8:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <style>
        body{
            background-image: url(https://cdn.pixabay.com/photo/2021/01/24/22/14/frame-5946730__480.jpg);
        }
    </style>

</head>
<body>
<div class="container-fluid  boder rounded p-3 "  >
    <div class="text-center fs-3">Edit Benh Nhan</div>
    <form action="/BenhNhanServlet?action=edit" method="post">
        <div class="mb-3 mt-2 .border-primary">
            <label  class="form-label"><b>maBenhNhan:</b></label>
            <input  type="text" class="form-control" name="maBenhNhan" aria-describedby="emailHelp" placeholder="please enter employee maBenhNhan" value="${benhNhan.maBenhNhan}" readonly >
        </div>
        <div class="mb-3">
            <label  class="form-label"><b>tenBenhNhan:</b></label>
            <input type="text" class="form-control" name="tenBenhNhan" placeholder="please enter employee tenBenhNhan" value="${benhNhan.tenBenhNhan}">
            <p style="color: red">${messenger}</p>
        </div>

        <div class="mb-3">
            <label  class="form-label"><b>ngayNhapVien:</b></label>
            <input type="date" class="form-control" name="ngayNhapVien" placeholder="please enter employee ngayNhapVien" value="${benhNhan.ngayNhapVien}">
        </div>
        <div class="mb-3">
            <label  class="form-label"><b>ngayRaVien:</b></label>
            <input type="date" class="form-control" name="ngayRaVien" placeholder="please enter employee ngayRaVien" value="${benhNhan.ngayRaVien}">
        </div>

        <div class="mb-3">
            <label  class="form-label"><b>lyDoNhapVien</b>:</label>
            <input type="text" class="form-control" name="lyDoNhapVien" placeholder="please enter employee lyDoNhapVien" value="${benhNhan.lyDoNhapVien}">
        </div>

        <div class="mb-3">
            <label  class="form-label"><b>maBenhAn</b>:</label>
            <input type="text" class="form-control" name="maBenhAn" placeholder="please enter employee maBenhAn" readonly value="${benhNhan.maBenhAn.maBenhAn}" >
        </div>




        <div class="mb-3">
            <button  type="submit" class="btn btn-primary">Submit</button>
        </div>

    </form>

</div>
<a href="./js/bootstrap.js"></a>

</body>
</html>
