package controller;

import bean.Student;
import service.ISService;
import service.Impl.SServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "STServlet" ,urlPatterns = {"","/st"})
public class STServlet extends HttpServlet {
    ISService isService = new SServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("actionUser");
    if(action== null){
        action="";
    }
    switch (action){
        case "add1":
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));
            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setAge(age);
            isService.add(student);
            response.sendRedirect("st");
            break;

    }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("actionUser");
        if( action == null){
            action = "";
        }
        switch (action){
            case "add":
               request.getRequestDispatcher("add.jsp").forward(request,response);
               break;
            default:
                List<Student> studentList =isService.FindAll();
                request.setAttribute("student",studentList);
                request.getRequestDispatcher("list.jsp").forward(request,response);
        }



    }
}
