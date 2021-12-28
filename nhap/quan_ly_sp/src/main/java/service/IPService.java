package service;

import bean.Product;

import java.util.List;

public interface IPService {
    List<Product> FindAll();
    void  add(Product product);
    Product findById(int id);
}
