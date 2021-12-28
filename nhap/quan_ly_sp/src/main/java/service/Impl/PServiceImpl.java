package service.Impl;

import bean.Product;
import ripository.IPRepository;
import ripository.Impl.PRepositoryImpl;
import service.IPService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PServiceImpl implements IPService {
    IPRepository ipRepository = new PRepositoryImpl();
    @Override
    public List<Product> FindAll() {
        return ipRepository.FindAll();
    }

    @Override
    public void add(Product product) {
ipRepository.add(product);
    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
