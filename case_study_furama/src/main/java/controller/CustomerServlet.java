package controller;

import bean.Customer;
import bean.CustomerType;
import service.ICustomerService;
import service.Impl.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet" , urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    ICustomerService iCustomerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        System.out.println("a");
        if(action == null){
            action = "";
        }
        switch (action){
            case "add" :
                addCustomer(request,response);
                getCustomer(request,response);
                break;
            case "edit":
                    edit(request,response);
                    getCustomer(request,response);
                break;
    }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
        System.out.println("a");
    if(action == null){
        action = "";
    }
    switch (action){
        case "add":
            addShow(request,response);
            break;

        case "edit" :
            showEdit(request,response);
            break;

        case "search" :
            search(request,response);
            break;

        default:
            getCustomer(request,response);
            break;
    }
    }

    public  void getCustomer(HttpServletRequest request, HttpServletResponse response){
        List<Customer> customerList = iCustomerService.findAllCustomer();
        request.setAttribute("customerList",customerList);
        try {
            request.getRequestDispatcher("customerList.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void search(HttpServletRequest request, HttpServletResponse response){

        try {
            String keyword = request.getParameter("keyword");
            List<Customer> customerList = iCustomerService.searchCustomer(keyword);
            request.setAttribute("customerList",customerList);

            request.getRequestDispatcher("customerList.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void showEdit(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("customer_id"));

        Customer customer = iCustomerService.getById(id);
        request.setAttribute("customer",customer);
        try {
            request.getRequestDispatcher("editCustomer.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void edit(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("customer_id"));
        int customerTypeId = Integer.parseInt(request.getParameter("customer_type_id"));
        String name = request.getParameter("customer_name");
        String birthDay = request.getParameter("customer_birthday");
        String gender = request.getParameter("customer_gender");
        String card = request.getParameter("customer_id_card");
        String phone = request.getParameter("customer_phone");
        String email = request.getParameter("customer_email");
        String address = request.getParameter("customer_address");
        Customer customer = new Customer(id,new CustomerType(customerTypeId),name,birthDay,gender,card,phone,email,address );
        iCustomerService.edit(customer);
    }

    public  void addShow(HttpServletRequest request, HttpServletResponse response){
        try {
            request.getRequestDispatcher("addCustomer.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addCustomer(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("customer_id"));
        int customerTypeId = Integer.parseInt(request.getParameter("customer_type_id"));
        String name = request.getParameter("customer_name");
        String birthDay = request.getParameter("customer_birthday");
        String gender = request.getParameter("customer_gender");
        String card = request.getParameter("customer_id_card");
        String phone = request.getParameter("customer_phone");
        String email = request.getParameter("customer_email");
        String address = request.getParameter("customer_address");
        Customer customer = new Customer(id,new CustomerType(customerTypeId),name,birthDay,gender,card,phone,email,address );
        iCustomerService.add(customer);
    }

}
