package service;

import bean.Product;

import java.util.List;

public interface IPS {
    List<Product> findAll();
    void insertProduct(Product product);
}
