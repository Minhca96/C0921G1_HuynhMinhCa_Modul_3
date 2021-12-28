package controller;

import bean.User;
import service.IUserS;
import service.Impl.UserSImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = {"", "/user"})
public class UserServlet extends HttpServlet {
    IUserS iUserS = new UserSImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("actionUser");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "search":
                search(request, response);
                break;
            default:
                try {
                    request.setAttribute("user", iUserS.FindAll());
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                request.getRequestDispatcher("list.jsp").forward(request, response);

        }


    }

    public void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("search");
        List<User> userList = iUserS.search(name);
        request.setAttribute("user",userList);
        request.getRequestDispatcher("list.jsp").forward(request, response);


    }


}
