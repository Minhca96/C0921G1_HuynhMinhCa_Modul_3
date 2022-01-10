package controller;

import bean.Category;
import bean.Product;
import service.IProductService;
import service.Impl.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ProductServlet" ,urlPatterns = {"","/ProductServlet"})
public class ProductServlet extends HttpServlet {
    IProductService iProductService = new ProductService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "add":
                addProduct(request,response);
                getAllProduct(request,response);
                break;

            case "edit":
                edit(request,response);
                getAllProduct(request,response);
                break;

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                deletaProduct(request, response);
                getAllProduct(request, response);
                break;

            case "add":
                request.getRequestDispatcher("add.jsp").forward(request,response);
            break;

            case "editShow":
                getId(request,response);
                break;

            case "search":
                searchNameAndId(request,response);
                break;

            default:
                getAllProduct(request, response);
                break;
        }
    }

    private void getAllProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = iProductService.getAll();
        request.setAttribute("productList", productList);
        request.getRequestDispatcher("home.jsp").forward(request, response);


    }

    private void deletaProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        iProductService.delete(id);

    }

    public void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("ten");
        String gia = request.getParameter("gia");
        String soLuong = request.getParameter("so_luong");
        String mau = request.getParameter("mau");
        String moTa = request.getParameter("mo_ta");
        String danhMuc = request.getParameter("danh_muc");


        Product product = new Product(id, name, gia, soLuong, mau, moTa, new Category(danhMuc));

        iProductService.add(product);


    }

   private void getId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id =Integer.parseInt(request.getParameter("id"));
        Product product = iProductService.getById(id);
        request.setAttribute("product",product);
        request.getRequestDispatcher("edit.jsp").forward(request,response);
    }

   private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Product product = new Product(

         Integer.parseInt(request.getParameter("id")),
         request.getParameter("ten"),
         request.getParameter("gia"),
         request.getParameter("so_luong"),
         request.getParameter("mau"),
         request.getParameter("mo_ta"),
        new Category(request.getParameter("danh_muc"))
        );
        iProductService.edit(product);

    }

    private  void searchNameAndId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String keyword = request.getParameter("keyword");
        List<Product> productList = iProductService.search(keyword);
        request.setAttribute("productList",productList);
        request.getRequestDispatcher("home.jsp").forward(request,response);

    }
}
