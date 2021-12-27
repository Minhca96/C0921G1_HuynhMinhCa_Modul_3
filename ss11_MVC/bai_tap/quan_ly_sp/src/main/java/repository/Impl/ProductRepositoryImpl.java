package repository.Impl;

import bean.Product;
import repository.IProductRepositoryImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductRepositoryImpl implements IProductRepositoryImpl {

   static private Map<Integer,Product> productMap;
   static {

       productMap= new TreeMap<>();
       productMap.put(1,new Product( 1,"banh Chuoi Chien","Viet Nam"));
       productMap.put(2,new Product(2,"Banh Kep","Viet Nam"));
       productMap.put(3,new Product(3,"Muc Gung", "China"));
       productMap.put(4, new Product(4,"Banh Da", "Viet Nam"));
   }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
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
