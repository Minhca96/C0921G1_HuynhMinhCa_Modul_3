<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 1/4/2022
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css"/>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        body {
            background-image: url(https://cdn.pixabay.com/photo/2016/10/17/14/31/background-1747777__340.jpg);
        }

        .bg {
            background-color: forestgreen;
        }
    </style>
</head>
<body>
<div class="container-fluid " style="padding-right: 0; padding-left: 0">
    <nav class="bg">

        <div class="row">
            <div class="col-lg-2 mt-3 text-lg-center">
                <form action="EmployeeServlet">
                    <input type="hidden" name="action" value="home">
                    <button class="bg-success btn btn-outline-light " type="submit">Home</button>
                </form>

            </div>
            <div class="col-lg-1 mt-3">
                <a>Employee</a>
            </div>
            <div class="col-lg-1 mt-3">
                <td><a class="bg-success btn btn-outline-light" href="CustomerServlet">Customer</a></td>
            </div>
            <div class="col-lg-1 mt-3">
                <a>Service</a>
            </div>
            <div class="col-lg-1 mt-3">
                <a>Contrac</a>
            </div>
            <div class="col-lg-5 mt-3 ">
                <form class="d-flex" action="customer">
                    <input type="hidden" name="action" value="search">
                    <input class="form-control me-5 " type="search" <c:forEach items="${customerList}" var="customer"> value="${customer.name}"</c:forEach> aria-label="Search"
                           name="keyword">
                    <button class="bg-success btn btn-outline-light" type="submit">Search</button>
                </form>
            </div>
        </div>


    </nav>
</div>

<div class="container-fluid" >
    <div class="row">
        <div class="col-lg-12 mt-3 text-lg-center">
            <form class="d-flex">
                <input type="hidden" name="action" value="add">
                <button class="bg-success btn btn-outline-light" type="submit">add</button>
            </form>
        </div>
        <div class=" col-lg-12">
            <%--            <table id="tableStudent" class="mt-3 table table-bordered  ">--%>
            <table id="tableStudent" class="table table-striped table-bordered" style="width:100%">

                <thead>
                <tr>
                    <th scope="col">id</th>
<%--                    <th scope="col">customerTypeId</th>--%>
                    <th scope="col">name</th>
                    <th scope="col">birthDay</th>
                    <th scope="col">gender</th>
                    <th scope="col">card</th>
                    <th scope="col">phone</th>
                    <th scope="col">email</th>
                    <th scope="col">address</th>
                    <%--                    <th scope="col">PId</th>--%>
                    <%--                    <th scope="col">EDId</th>--%>
                    <%--                    <th scope="col">DId</th>--%>
                    <%--                    <th scope="col">UName</th>--%>
                    <th scope="col">Edit</th>
                    <th scope="col">Delete</th>
                    <th scope="col">Properties</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${customerList}" var="customer">

                    <tr>
                        <td>${customer.id}</td>
<%--                        <td>${customer.customerTypeId}</td>--%>
                        <td>${customer.name}</td>
                        <td>${customer.birthDay}</td>
                        <td>${customer.gender}</td>
                        <td>${customer.card}</td>
                        <td>${customer.phone}</td>
                        <td>${customer.email}</td>
                        <td>${customer.address}</td>
                            <%--                        <td>${employee.positionId.id}</td>--%>
                            <%--                        <td>${employee.educationDegreenId.id}</td>--%>
                            <%--                        <td>${employee.divisionId.id}</td>--%>
                            <%--                        <td>${null}</td>--%>
                        <td><a class="bg-success btn btn-outline-light" href="customer?action=edit&customer_id=${customer.id}">Edit</a></td>

                        <td><a class="bg-success btn btn-outline-light" href="EmployeeServlet?action=properties&employee_id=${customer.id}">Properties</a></td>



                        <td>
                            <!-- Button trigger modal -->
                            <button type="button" class="btn btn-danger" data-toggle="modal"
                                    data-target="#exampleModal-${customer.id}">
                                Delete
                            </button>

                            <!-- Modal -->
                            <div class="modal fade" id="exampleModal-${customer.id}" tabindex="-1" role="dialog"
                                 aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            Ban co muon xoa nhan vien ${customer.name}
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close
                                            </button>
                        <a class="bg-success btn btn-outline-danger" href="EmployeeServlet?action=delete&employee_id=${customer.id}">Delete</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </td>







                    </tr>

                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableStudent').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        });
    });
</script>
</body>
</html>
