package service.Impl;

import bean.Customer;
import repository.ICustomerRepository;
import repository.Impl.CustomerRepository;
import service.ICustomerService;
import service.IEmployeeService;

import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository= new CustomerRepository();
    @Override
    public List<Customer> findAllCustomer() {
       return iCustomerRepository.findAllCustomer();
    }

    @Override
    public List<Customer> searchCustomer(String keyword) {
        return  iCustomerRepository.searchCustomer(keyword);
    }

    @Override
    public void edit(Customer customer) {
        iCustomerRepository.edit(customer);
    }

    @Override
    public Customer getById(int id) {
        return iCustomerRepository.getById(id);
    }

    @Override
    public void add(Customer customer) {
        iCustomerRepository.add(customer);
    }
}
