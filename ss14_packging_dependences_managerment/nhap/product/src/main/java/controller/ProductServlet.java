package controller;

import bean.Product;
import service.IPS;
import service.Impl.ProductSImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = { "", "/product"})
public class ProductServlet extends HttpServlet {
    IPS ips = new ProductSImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if( action == null){
            action = "";
        }
        switch (action){
            case "create":
                insertNewProduct(request,response);
                break;


            default:
                getAll(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if( action == null){
        action = "";
    }
    switch (action){
        case "add":
            save(request,response);
            break;


        default:
           getAll(request,response);
    }

    }
    public void getAll(HttpServletRequest request, HttpServletResponse response){

        try {
            request.setAttribute("list", ips.findAll());
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
     public void save(HttpServletRequest request, HttpServletResponse response){
         try {
             request.getRequestDispatcher("create.jsp").forward(request,response);
         } catch (ServletException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }

     }
     public  void insertNewProduct(HttpServletRequest request, HttpServletResponse response){
        String name= request.getParameter("name");
        double price =Double.parseDouble(request.getParameter("price"));
        String origin = request.getParameter("origin");
        Product product = new Product();
         product.setName(name);
         product.setOrigin(origin);
         product.setPrice(price);
         ips.insertProduct(product);
         request.setAttribute("list" ,ips.findAll());

         try {
             request.getRequestDispatcher("list.jsp").forward(request, response);
         } catch (ServletException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }

     }

}
