package ripository.Impl;

import bean.Product;
import ripository.IPRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PRepositoryImpl  implements IPRepository {
      static  Map<Integer,Product> productMap ;
    static {
        productMap = new TreeMap<>();
        productMap.put(1,new Product(1,"banh my","trung quoc"));
        productMap.put(2, new Product(2,"banh kep","viet nam"));
        productMap.put(3,new Product(3,"banh xoai","viet nam"));

    }
    @Override
    public List<Product> FindAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void add(Product product) {
              productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
