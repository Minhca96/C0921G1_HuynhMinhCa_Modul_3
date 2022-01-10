
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
    <div class="text-center fs-3">Add Employee</div>
    <form action="/EmployeeServlet?action=add" method="post" class="col-6 " style="margin: auto">
        <div class="mb-3 mt-2 .border-p">
            <label  class="form-label "><b>employee_id</b></label>
            <input  type="number" class="form-control" name="employee_id" aria-describedby="emailHelp" placeholder="please enter employee employee_id">
        </div>
        <div class="mb-3">
            <label  class="form-label"><b>employee_name</b>:</label>
            <input type="text" class="form-control" name="employee_name" placeholder="please enter employee employee_name">
        </div>

        <div class="mb-3">
            <label  class="form-label "><b>employee_birthday</b>:</label>
            <input type="date" class="form-control col-10" name="employee_birthday" placeholder="please enter employee employee_birthday">
        </div>
        <div class="mb-3">
            <label  class="form-label "><b>employee_card</b>:</label>
            <input type="text" class="form-control" name="employee_card" placeholder="please enter employee customer_birthday">
            <h5 style="color: red">${msgIdCArd}</h5>
        </div>

        <div class="mb-3">
            <label  class="form-label "><b>employee_salary</b>:</label>
            <input type="number" class="form-control" name="employee_salary" placeholder="please enter employee employee_salary">
        </div>

        <div class="mb-3">
            <label  class="form-label "><b>employee_phone</b>:</label>
            <input type="text" class="form-control" name="employee_phone" placeholder="please enter employee employee_phone">
        </div>

        <div class="mb-3">
            <label  class="form-label "><b>employee_mail</b>:</label>
            <input type="text" class="form-control" name="employee_mail" placeholder="please enter employee employee_mail">
            <p>${msgEmail}</p>
        </div>
        <div class="mb-3">
            <label  class="form-label "><b>employee_address</b>:</label>
            <input type="text" class="form-control" name="employee_address" placeholder="please enter employee employee_address">
        </div>
        <div class="mb-3">
            <label  class="form-label "><b>position_id</b>:</label>
            <input type="number" class="form-control" name="position_id" placeholder="please enter employee position_id">
        </div>

        <div class="mb-3">
            <label  class="form-label "><b>education_degree_id</b>:</label>
            <input type="number" class="form-control" name="education_degree_id" placeholder="please enter employee education_degree_id">
        </div>

        <div class="mb-3">
            <label  class="form-label "><b>divition_id</b>:</label>
            <input type="number" class="form-control" name="divition_id" placeholder="please enter employee divition_id">
        </div>

        <div class="mb-3">
            <label  class="form-label "><b>username</b>:</label>
            <input type="text" class="form-control" name="username" placeholder="please enter employee username">
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
