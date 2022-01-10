package service.Impl;

import bean.Product;
import ropository.IProductRepository;
import ropository.Impl.ProductRepository;
import service.IProductService;

import java.util.List;

public class ProductService implements IProductService {

    IProductRepository iProductRepository = new ProductRepository();
    @Override
    public List<Product> getAll() {
        return iProductRepository.getAll() ;
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }

    @Override
    public void add(Product product) {
        iProductRepository.add(product);
    }

    @Override
    public Product getById(int id) {
         return  iProductRepository.getById(id);
    }

    @Override
    public void edit(Product product) {
        iProductRepository.edit(product);

    }

    @Override
    public List<Product> search(String keyword) {
        return iProductRepository.search(keyword);
    }
}
