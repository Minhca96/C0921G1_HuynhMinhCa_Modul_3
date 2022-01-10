
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
    <div class="text-center fs-3">Add Customer</div>
    <form action="/customer?action=add" method="post">
    <div class="mb-3 mt-2 .border-primary">
        <label  class="form-label"><b>customer_id:</b></label>
        <input  type="number" class="form-control" name="customer_id" aria-describedby="emailHelp" placeholder="please enter employee customer_id">
    </div>
    <div class="mb-3">
        <label  class="form-label"><b>customer_type_id:</b></label>
        <input type="number" class="form-control" name="customer_type_id" placeholder="please enter employee customer_type_id">
    </div>

    <div class="mb-3">
        <label  class="form-label"><b>customer_name:</b></label>
        <input type="text" class="form-control" name="customer_name" placeholder="please enter employee customer_name">
    </div>
    <div class="mb-3">
        <label  class="form-label"><b>customer_birthday</b>:</label>
        <input type="date" class="form-control" name="customer_birthday" placeholder="please enter employee customer_birthday">
    </div>

    <div class="mb-3">
        <label  class="form-label"><b>customer_gender</b>:</label>
        <input type="text" class="form-control" name="customer_gender" placeholder="please enter employee customer_gender">
    </div>

    <div class="mb-3">
        <label  class="form-label"><b>customer_id_card</b>:</label>
        <input type="text" class="form-control" name="customer_id_card" placeholder="please enter employee customer_id_card">
    </div>

    <div class="mb-3">
        <label  class="form-label"><b>customer_phone</b>:</label>
        <input type="number" class="form-control" name="customer_phone" placeholder="please enter employee customer_phone">
    </div>
    <div class="mb-3">
        <label class="form-label"><b>customer_email</b>:</label>
        <input type="text" class="form-control" name="customer_email" placeholder="please enter employee customer_email">
    </div>
    <div class="mb-3">
        <label  class="form-label"><b>customer_address</b>:</label>
        <input type="text" class="form-control" name="customer_address" placeholder="please enter employee customer_address">
    </div>


        <div class="mb-3">
            <button  type="submit" class="btn btn-primary">Submit</button>
        </div>

</form>

</div>
<a href="./js/bootstrap.js"></a>

</body>
</html>
