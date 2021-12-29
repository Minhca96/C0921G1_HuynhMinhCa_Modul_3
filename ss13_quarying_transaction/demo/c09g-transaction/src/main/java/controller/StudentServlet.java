package controller;

import bean.Student;
import service.IStudentService;
import service.impl.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = {"", "/student"})
public class StudentServlet extends HttpServlet {

    // DI
    private IStudentService iStudentService = new StudentService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");

        if (actionUser == null) {
            actionUser = "";
        }

        switch (actionUser) {
            case "create":
                String name = request.getParameter("nameStudent");
                String dateOfBirth = request.getParameter("dateOfBirth");

                Student studentObj = new Student();
                studentObj.setName(name);
                studentObj.setDateOfBirth(dateOfBirth);

                this.iStudentService.save(studentObj);

                request.setAttribute("studentList", iStudentService.findAll());
                request.getRequestDispatcher("list_student_jstl.jsp")
                        .forward(request, response);

                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actionUser = request.getParameter("actionUser");

        if (actionUser == null) {
            actionUser = "";
        }

        switch (actionUser) {
            case "create":
                request.getRequestDispatcher("create_student.jsp")
                        .forward(request, response);
                break;
            case "update":
                break;
            case "search":
                String keyword = request.getParameter("keyword");
                List<Student> studentList = this.iStudentService.findByKeyword(keyword);

                request.setAttribute("studentList", studentList);
                request.getRequestDispatcher("list_student_jstl.jsp")
                        .forward(request, response);
                break;
            case "transaction":
                String msg = this.iStudentService.callTransaction();
                request.setAttribute("msgInfo", msg);
                request.getRequestDispatcher("result_transaction.jsp").forward(request, response);
            default:
                request.setAttribute("studentList", iStudentService.findAll());
                request.getRequestDispatcher("list_student_jstl.jsp")
                        .forward(request, response);
        }

    }

}
