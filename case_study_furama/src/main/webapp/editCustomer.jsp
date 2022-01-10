<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 1/4/2022
  Time: 4:43 PM
  To change this template use File | Settings | File Templates.
--%>
%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
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
<div class="container-fluid  boder rounded p-3">
    <form action="customer?action=edit" method="post">

        <div class="col-lg-12 mb-1 mt-1 .border-primary text-center">
            <b class="form-label text-light fs-3"> Edit Customer</b>
        </div>

        <div class="mb-3 mt-2 .border-primary">
            <label  class="form-label">customer_id:</label>
            <input  type="number" class="form-control" name="customer_id" aria-describedby="emailHelp" placeholder="please enter employee id" value="${customer.id}">
        </div>
        <div class="mb-3">
            <label  class="form-label">customer_type_id:</label>
            <input type="number" class="form-control" name="customer_type_id" placeholder="please enter employee Name" value="${customer.customerTypeId.id}">
        </div>

        <div class="mb-3">
            <label  class="form-label">customer_name:</label>
            <input type="text" class="form-control" name="customer_name" placeholder="please enter employee BirthDay" value="${customer.name}">
        </div>
        <div class="mb-3">
            <label  class="form-label">customer_birthday:</label>
            <input type="date" class="form-control" name="customer_birthday" placeholder="please enter employee Card" value="${customer.birthDay}">
        </div>

        <div class="mb-3">
            <label  class="form-label">customer_gender:</label>
            <input type="text" class="form-control" name="customer_gender" placeholder="please enter employee Salary" value="${customer.gender}">
        </div>

        <div class="mb-3">
            <label  class="form-label">customer_id_card:</label>
            <input type="text" class="form-control" name="customer_id_card" placeholder="please enter employee Phone" value="${customer.card}">
        </div>
        <div class="mb-3">
            <label  class="form-label">customer_phone:</label>
            <input type="number" class="form-control" name="customer_phone" placeholder="please enter employee Email" value="${customer.phone}">
        </div>
        <div class="mb-3">
            <label  class="form-label">customer_email:</label>
            <input type="text" class="form-control" name="customer_email" placeholder="please enter employee Address" value="${customer.email}">
        </div>
        <div class="mb-3">
            <label class="form-label">customer_address:</label>
            <input type="text" class="form-control" name="customer_address" placeholder="please enter employee PId" value="${customer.address}">
        </div>



<%--        <div class="mb-3 form-check">--%>
<%--            <input type="checkbox" class="form-check-input" id="exampleCheck1">--%>
<%--            <label class="form-check-label" for="exampleCheck1">Check me out</label>--%>
<%--        </div>--%>
        <div class="mb-3">
            <button  type="submit" class="btn btn-primary">Submit</button>
        </div>

    </form>

</div>
<a href="./js/bootstrap.js"></a>

</body>
</html>

