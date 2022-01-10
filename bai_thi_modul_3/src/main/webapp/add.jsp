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
<div  >
    <div class="container-fluid  boder rounded p-3 "  >
        <div class="text-center fs-3">Add Product</div>
        <form action="/ProductServlet?action=add" method="post" class="col-6 " style="margin: auto">
            <div class="mb-3 mt-2 .border-p">
                <label  class="form-label "><b>Id</b></label>
                <input  type="number" class="form-control" name="id" aria-describedby="emailHelp" placeholder="please enter id">
            </div>
            <div class="mb-3">
                <label  class="form-label"><b>Name</b>:</label>
                <input type="text" class="form-control" name="ten" placeholder="please enter name">
            </div>

            <div class="mb-3">
                <label  class="form-label "><b>Gia</b>:</label>
                <input type="number" class="form-control col-10" name="gia" placeholder="please enter gia">
            </div>
            <div class="mb-3">
                <label  class="form-label "><b>So Luong</b>:</label>
                <input type="number" class="form-control" name="so_luong" placeholder="please enter so luonng">
<%--                <h5 style="color: red">${msgIdCArd}</h5>--%>
            </div>

            <div class="mb-3">
                <label  class="form-label "><b>Mau</b>:</label>
                <input type="text" class="form-control" name="mau" placeholder="please enter mau">
            </div>

            <div class="mb-3">
                <label  class="form-label "><b>Mo Ta</b>:</label>
                <input type="text" class="form-control" name="mo_ta" placeholder="please enter mo ta">
            </div>

            <div class="mb-3">
                <label  class="form-label "><b>Danh Muc</b>:</label>
                <input type="text" class="form-control" name="danh_muc" placeholder="please enter danh muc">
<%--                <p>${msgEmail}</p>--%>
            </div>


            <div class="mb-3">
                <button  type="submit" class="btn btn-primary">Submit</button>
            </div>

        </form>

    </div>
</div>
<a href="./js/bootstrap.js"></a>

</body>
</html>
