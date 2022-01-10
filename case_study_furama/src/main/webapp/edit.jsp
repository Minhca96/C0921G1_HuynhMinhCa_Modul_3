
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
<div class="container-fluid   boder rounded p-3">
    <form action="EmployeeServlet?action=edit" method="post">

        <div class="col-lg-12 mb-1 mt-1 .border-primary text-center">
            <b class="form-label text-light fs-3"> Edit Employee</b>
        </div>

        <div class="mb-3 mt-2 .border-primary">
            <label  class="form-label">Id:</label>
            <input  type="number" class="form-control" name="employee_id" aria-describedby="emailHelp" placeholder="please enter employee id" value="${employee.id}">
        </div>
        <div class="mb-3">
            <label  class="form-label">Name:</label>
            <input type="text" class="form-control" name="employee_name" placeholder="please enter employee Name" value="${employee.name}">
        </div>

        <div class="mb-3">
            <label  class="form-label">BirthDay:</label>
            <input type="date" class="form-control" name="employee_birthday" placeholder="please enter employee BirthDay" value="${employee.birthDate}">
        </div>
        <div class="mb-3">
            <label  class="form-label">Card:</label>
            <input type="text" class="form-control" name="employee_card" placeholder="please enter employee Card" value="${employee.card}">
        </div>

        <div class="mb-3">
            <label  class="form-label">Salary:</label>
            <input type="number" class="form-control" name="employee_salary" placeholder="please enter employee Salary" value="${employee.salary}">
        </div>

        <div class="mb-3">
            <label  class="form-label">Phone:</label>
            <input type="number" class="form-control" name="employee_phone" placeholder="please enter employee Phone" value="${employee.phone}">
        </div>
        <div class="mb-3">
            <label  class="form-label">Email:</label>
            <input type="text" class="form-control" name="employee_mail" placeholder="please enter employee Email" value="${employee.email}">
        </div>
        <div class="mb-3">
            <label  class="form-label">Address:</label>
            <input type="text" class="form-control" name="employee_address" placeholder="please enter employee Address" value="${employee.address}">
        </div>
        <div class="mb-3">
            <label class="form-label">PositionId:</label>
            <input type="number" class="form-control" name="position_id" placeholder="please enter employee PId" value="${employee.positionId.id}">
        </div>
        <div class="mb-3">
            <label  class="form-label">EducationDegreenId:</label>
            <input type="number" class="form-control" name="education_degree_id" placeholder="please enter employee EDId" value="${employee.educationDegreenId.id}">
        </div>
        <div class="mb-3">
            <label  class="form-label">DivisionId:</label>
            <input type="number" class="form-control" name="divition_id" placeholder="please enter employee DId" value="${employee.divisionId.id}">
        </div>

        <div class="mb-3">
            <label  class="form-label">UserName:</label>
            <input type="text" class="form-control" name="username" placeholder="please enter employee UName" value="${null}">
        </div>

        <div class="mb-3 form-check">
            <input type="checkbox" class="form-check-input" id="exampleCheck1">
            <label class="form-check-label" for="exampleCheck1">Check me out</label>
        </div>
        <div class="mb-3">
            <button  type="submit" class="btn btn-primary">Submit</button>
        </div>

    </form>

</div>
<a href="./js/bootstrap.js"></a>

</body>
</html>
