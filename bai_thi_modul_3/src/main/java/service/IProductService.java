package service;

import bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void delete(int id);

    void add(Product product);

    Product getById(int id);

    void edit(Product product);

    List<Product> search(String keyword);
}
