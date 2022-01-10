package repository.Impl;

import bean.Product;
import repository.IPR;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductPImpl implements IPR {

    private String jdbcURL = "jdbc:mysql://localhost:3306/store";
    private String jdbcUsername = "root";
    private String jdbcPassword = "01021996";

//    private static final String INSERT_USERS_SQL = "insert into username (name, email,country) value ( ?, ?, ?)";
//
//    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
//    private static final String SELECT_ALL_USERS = "select * from username";
//    private static final String DELETE_USERS_SQL = "delete from username where id = ?;";
//    private static final String UPDATE_USERS_SQL = "update username set name = ?,email= ?, country =? where id = ?;";

    public ProductPImpl() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }



    @Override
    public List<Product> findAll() {

        List<Product> productList = new ArrayList<>();

        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
            ResultSet rs =preparedStatement.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price =rs.getDouble("price");
                String origin = rs.getNString("origin");
                productList.add( new Product(id,name,price,origin));

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return productList;
    }

    @Override
    public void insertProduct(Product product) {

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement =connection.prepareStatement("insert into product(`name`,price,origin) value (?,?,?);");
            preparedStatement.setString(1,product.getName());
            preparedStatement.setDouble(2,product.getPrice());
            preparedStatement.setString(3,product.getOrigin());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }




//    public static void main(String[] args) {
//        IPR ipr = new ProductPImpl();
//        for(Product e: ipr.findAll()){
//            System.out.println(e);
//        }
//    }
}
