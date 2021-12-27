package sevice.Impl;

import bean.Product;
import repository.IProductRepositoryImpl;
import repository.Impl.ProductRepositoryImpl;
import sevice.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    IProductRepositoryImpl iProductRepository = new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
