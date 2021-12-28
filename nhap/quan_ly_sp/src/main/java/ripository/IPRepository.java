package ripository;

import bean.Product;

import java.util.List;

public interface IPRepository {

    List<Product> FindAll();
     void  add(Product product);
     Product findById(int id);

}
