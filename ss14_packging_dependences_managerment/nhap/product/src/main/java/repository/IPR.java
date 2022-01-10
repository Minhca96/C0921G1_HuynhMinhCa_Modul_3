package repository;

import bean.Product;

import java.util.List;

public interface IPR {
    List<Product> findAll();

    void insertProduct(Product product);

}
