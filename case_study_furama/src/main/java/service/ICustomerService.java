package service;

import bean.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAllCustomer();

    List<Customer>  searchCustomer(String keyword);

    void edit(Customer customer);

    Customer getById (int id);

    void add(Customer customer);
}
