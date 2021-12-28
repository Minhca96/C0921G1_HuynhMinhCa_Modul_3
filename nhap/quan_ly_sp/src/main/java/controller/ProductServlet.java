package controller;

import bean.Product;
import service.IPService;
import service.Impl.PServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"","/product"})
public class ProductServlet extends HttpServlet {

     IPService ipService = new PServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("actionProduct");
    if(action== null){
        action="";
    }

    switch (action){
        case "add1":
           int id = Integer.parseInt(request.getParameter("id"));
            String name= request.getParameter("name");
           String origin= request.getParameter("origin");

           Product product = new Product();
           product.setId(id);
           product.setName(name);
           product.setOrigin(origin);
           ipService.add(product);
           response.sendRedirect("product");

            break;

    }





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("actionProduct");
        if (action == null){
            action = "";
        }
        switch (action){
            case "add":
                request.getRequestDispatcher("add.jsp").forward(request,response);
                break;
            default:
                List<Product> productList = ipService.FindAll();
                request.setAttribute("product" ,productList);
                request.getRequestDispatcher("list.jsp").forward(request,response);
                break;
        }



    }
}
