<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 1/5/2022
  Time: 11:49 PM
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
    <div class="text-center fs-3">Add Benh Nhan</div>
    <form action="/BenhNhanServlet?action=add" method="post">
        <div class="mb-3 mt-2 .border-primary">
            <b>maBenhNhan: </b>
            <input  type="text" class="form-control" name="maBenhNhan" aria-describedby="emailHelp" placeholder="please enter employee maBenhNhan" value="${benhNhan.maBenhNhan}" >
        </div>
        <div class="mb-3">
            <b>tenBenhNhan: </b>
            <input type="text" class="form-control" name="tenBenhNhan" placeholder="please enter employee tenBenhNhan" value="${benhNhan.tenBenhNhan}">
            <p style="color: red">${messenger1}</p>
        </div>

        <div class="mb-3">
            <b>ngayNhapVien: </b>
            <input type="date" class="form-control" name="ngayNhapVien" placeholder="please enter employee ngayNhapVien" value="${benhNhan.ngayNhapVien}">
        </div>
        <div class="mb-3">
            <b>ngayRaVien: </b>
            <input type="date" class="form-control" name="ngayRaVien" placeholder="please enter employee ngayRaVien" value="${benhNhan.ngayRaVien}">
        </div>

        <div class="mb-3">
            <b>lyDoNhapVien: </b><input type="text" class="form-control" name="lyDoNhapVien" placeholder="please enter employee lyDoNhapVien" value="${benhNhan.lyDoNhapVien}">
        </div>

        <div class="mb-3">
            <b>maBenhAn: </b><input type="text" class="form-control" name="maBenhAn" placeholder="please enter employee maBenhAn" value="${benhNhan.maBenhAn.maBenhAn}">
        </div>




        <div class="mb-3">
            <button  type="submit" class="btn btn-primary">Submit</button>
        </div>

    </form>

</div>
<a href="./js/bootstrap.js"></a>

</body>
</html>

