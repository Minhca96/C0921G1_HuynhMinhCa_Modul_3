<%--
  Created by IntelliJ IDEA.
  User: Ca
  Date: 12/31/2021
  Time: 10:37 AM
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
<div class="container-fluid " >
    <div class="row">
        <div class="col-xl-12">
    <nav class="bg ">

        <div class="row">
            <div class="col-xl-2 mt-3 text-lg-center">
                <form action="EmployeeServlet">
                    <input type="hidden" name="action" value="home">
                    <button class="bg-success btn btn-outline-dark " type="submit">Home</button>
                </form>

            </div>
            <div class="col-xl-1 mt-3">
                <a class="bg-success btn btn-outline-dark" >Employee</a>
            </div>

            <div class="col-xl-1 mt-3">
                <a class="bg-success btn btn-outline-dark" href="/customer">Customer</a>
            </div>

            <div class="col-xl-1 mt-3">
                <a class="bg-success btn btn-outline-dark">Service</a>
            </div>
            <div class="col-xl-1 mt-3">
                <a class="bg-success btn btn-outline-dark">Contrac</a>
            </div>
            <div class="col-xl-6 mt-3 text-center  " style="padding-left: 40px; padding-right: 40px">
                <form class="d-flex" action="EmployeeServlet">
                    <input type="hidden" name="action" value="search">
                    <input class="form-control me-5 " type="search" placeholder="Search" aria-label="Search"
                           name="keyword">
                    <button class="bg-success btn btn-outline-dark" type="submit">Search</button>
                </form>
            </div>
        </div>


    </nav>
        </div>

    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12 mt-3 text-lg-center">

                <form class="d-flex ">
                    <input type="hidden" name="action" value="add" >
                    <button class="bg-success btn btn-outline-dark" style="padding-right: 25px;padding-left: 25px ;text-align: center" type="submit">Add</button>
                </form>

        </div>
        <div class=" col-lg-12">
            <%--            <table id="tableStudent" class="mt-3 table table-bordered  ">--%>
            <table id="tableStudent" class="table table-striped table-bordered" style="width:100%">

                <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">BirthDay</th>
                    <th scope="col">Card</th>
                    <th scope="col">Salary</th>
                    <th scope="col">Phone</th>
                    <th scope="col">Email</th>
                    <th scope="col">Address</th>
                    <%--                    <th scope="col">PId</th>--%>
                    <%--                    <th scope="col">EDId</th>--%>
                    <%--                    <th scope="col">DId</th>--%>
                    <%--                    <th scope="col">UName</th>--%>
                    <th scope="col">Edit</th>
                    <th scope="col">Properties</th>
                    <th scope="col">Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${employeeList}" var="employee">

                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.name}</td>
                        <td>${employee.birthDate}</td>
                        <td>${employee.card}</td>
                        <td>${employee.salary}</td>
                        <td>${employee.phone}</td>
                        <td>${employee.email}</td>
                        <td>${employee.address}</td>
                            <%--                        <td>${employee.positionId.id}</td>--%>
                            <%--                        <td>${employee.educationDegreenId.id}</td>--%>
                            <%--                        <td>${employee.divisionId.id}</td>--%>
                            <%--                        <td>${null}</td>--%>
                        <td><a class="bg-success btn btn-outline-dark"
                               href="EmployeeServlet?action=edit&employee_id=${employee.id}">Edit</a></td>

                        <td><a class="bg-success btn btn-outline-dark"
                               href="EmployeeServlet?action=properties&employee_id=${employee.id}">Properties</a></td>

                        <td>
                            <!-- Button trigger modal -->
                            <button type="button" class="btn btn-danger" data-toggle="modal"
                                    data-target="#exampleModal-${employee.id}">
                                Delete
                            </button>

                            <!-- Modal -->
                            <div class="modal fade" id="exampleModal-${employee.id}" tabindex="-1" role="dialog"
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
                                            Ban co muon xoa nhan vien ${employee.name}
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close
                                            </button>
                                            <a class="bg-success btn btn-outline-danger"
                                               href="EmployeeServlet?action=delete&employee_id=${employee.id}">Delete</a>
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
