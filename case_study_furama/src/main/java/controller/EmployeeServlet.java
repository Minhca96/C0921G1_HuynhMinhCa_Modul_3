package controller;

import bean.*;
import service.IEmployeeService;
import service.Impl.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "EmployeeServlet" , urlPatterns = {"","/EmployeeServlet"})
public class EmployeeServlet extends HttpServlet {
    IEmployeeService iEmployeeService = new EmployeeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "add":
                add(request,response);
                getAll(request,response);
                break;
            case "edit":
                    update(request,response);
                    getAll(request,response);
                break;

//            default:
//                List<Employee> employeeList = iEmployeeService.findAll() ;
//                request.setAttribute("employeeList", employeeList);
//                request.getRequestDispatcher("home.jsp").forward(request,response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "add":
            request.getRequestDispatcher("addEmployee.jsp").forward(request,response);
            break;

            case "search":
                search_name(request,response);
                break;
            case "home":
                getAll(request,response);
                break;
            case "delete":
                delete(request,response);
                getAll(request,response);
                break;
            case "edit":
                edit(request,response);
            case "properties":
                properties(request,response);

            default:
                getAll(request,response);

        }


    }
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("employee_id"));
        String name = request.getParameter("employee_name");
        String birthDate =request.getParameter("employee_birthday");
        String card= request.getParameter("employee_card");
        String salary = request.getParameter("employee_salary");
        String phone =request.getParameter("employee_phone");
        String email = request.getParameter("employee_mail");
        String address = request.getParameter("employee_address");
        int positionId = Integer.parseInt(request.getParameter("position_id"));
        int educationDegreenId = Integer.parseInt(request.getParameter("education_degree_id"));
        int divisionId = Integer.parseInt(request.getParameter("divition_id"));
        String userName = request.getParameter("username");
        Employee employee = new Employee(id,name,birthDate,card,salary,phone,email,address, new Position(positionId),
                new EducationDegree(educationDegreenId),new Division(divisionId),new User(userName));

        Map<String,String> msgErr = iEmployeeService.add(employee);

        if (!msgErr.isEmpty()){
            request.setAttribute("msgIdCArd",msgErr.get("msgId") );
            request.setAttribute("msgEmail",msgErr.get("msgEmail"));
            request.getRequestDispatcher("addEmployee.jsp").forward(request,response);
        }



    }
    public void getAll(HttpServletRequest request, HttpServletResponse response){

        try {
            List<Employee> employeeList = iEmployeeService.findAll();
            request.setAttribute("employeeList",employeeList );
            request.getRequestDispatcher("home.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void search_name(HttpServletRequest request, HttpServletResponse response){


        try {
            String keyword = request.getParameter("keyword");
            List<Employee> employeeList = iEmployeeService.search(keyword);

            request.setAttribute("employeeList",employeeList);
            request.getRequestDispatcher("home.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void  delete(HttpServletRequest request, HttpServletResponse response){
        int id =Integer.parseInt( request.getParameter("employee_id"));
        try {
            iEmployeeService.delete(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }

    }

    public  void edit (HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("employee_id"));
        Employee employee = null;
        try {
             employee = iEmployeeService.getById(id);
            request.setAttribute("employee",employee);
            request.getRequestDispatcher("edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  void properties (HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("employee_id"));
        Employee employee = null;
        try {
            employee = iEmployeeService.getById(id);
            request.setAttribute("employee",employee);
            request.getRequestDispatcher("properties.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void update(HttpServletRequest request, HttpServletResponse response){
       int id = Integer.parseInt(request.getParameter("employee_id")) ;
       String name =request.getParameter("employee_name");
       String birthDate = request.getParameter("employee_birthday");
       String card =request.getParameter("employee_card");
       String salary = request.getParameter("employee_salary");
       String phone = request.getParameter("employee_phone");
       String email = request.getParameter("employee_mail");
       String address = request.getParameter("employee_address");
       int positionId = Integer.parseInt(request.getParameter("position_id"));
        int educationDegreenId = Integer.parseInt( request.getParameter("education_degree_id"));
        int  divisionId = Integer.parseInt(request.getParameter("divition_id"));
        String userName = request.getParameter("userName");
        Employee employee = new Employee(id,name,birthDate,card,salary,phone,email,address,new Position(positionId),new EducationDegree(educationDegreenId),new Division(divisionId),new User(userName));
        try {
            iEmployeeService.edit(employee);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

