package service.Impl;

import bean.Product;
import repository.IPR;
import repository.Impl.ProductPImpl;
import service.IPS;

import java.util.List;

public class ProductSImpl implements IPS {
    IPR ipr = new ProductPImpl();
    @Override
    public List<Product> findAll() {
       return ipr.findAll();
    }

    @Override
    public void insertProduct(Product product) {
        ipr.insertProduct(product);

    }
}
