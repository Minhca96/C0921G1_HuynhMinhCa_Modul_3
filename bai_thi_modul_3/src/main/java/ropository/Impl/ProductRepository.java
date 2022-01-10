package ropository.Impl;

import bean.Category;
import bean.Product;
import ropository.IProductRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement("SELECT * FROM product");
            ResultSet rs =statement.executeQuery();
            while (rs.next()){
            Product product = new Product(
                    rs.getInt("id"),
                    rs.getString("ten"),
                    rs.getString("gia"),
                    rs.getString("so_luong"),
                    rs.getString("mau"),
                    rs.getString("mo_ta"),
                    new Category(rs.getString("danh_muc"))
            );
            productList.add(product);

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return productList;
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement("delete from product where id = ?");
            statement.setInt(1,id);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void add(Product product) {

        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement("insert into product(ten,gia,so_luong,mau,mo_ta,danh_muc) values (?,?,?,?,?,?)");

            statement.setString(1,product.getTen());
            statement.setString(2,product.getGia());
            statement.setString(3,product.getSoLuong());
            statement.setString(4,product.getMau());
            statement.setString(5,product.getMoTa());
            statement.setString(6,product.getDanhMuc().getDanhMuc());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    @Override
    public Product getById(int id) {
        Product product = null;
        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement("select * from product where id = ?");
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                product = new Product(
                        rs.getInt("id"),
                        rs.getString("ten"),
                        rs.getString("gia"),
                        rs.getString("so_luong"),
                        rs.getString("mau"),
                        rs.getString("mo_ta"),
                        new Category(rs.getString("danh_muc"))
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public void edit(Product product) {

        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement("update product set ten=?, gia=?,so_luong=?, mau=?,mo_ta=?,danh_muc=? where id=?");
            statement.setString(1,product.getTen());
            statement.setString(2,product.getGia());
            statement.setString(3,product.getSoLuong());
            statement.setString(4,product.getMau());
            statement.setString(5,product.getMoTa());
            statement.setString(6,product.getDanhMuc().getDanhMuc());
            statement.setInt(7,product.getId());
            statement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<Product> search(String keyword) {
        List<Product> productList = new ArrayList<>();
        Product product = null;
        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement("select *  from product  where ten like ? or gia like ? ");
            statement.setString(1,"%"+keyword+"%");
            statement.setString(2,"%"+keyword+"%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                product = new Product(
                        rs.getInt("id"),
                        rs.getString("ten"),
                        rs.getString("gia"),
                        rs.getString("so_luong"),
                        rs.getString("mau"),
                        rs.getString("mo_ta"),
                        new Category(rs.getString("danh_muc"))

                );
                productList.add(product);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return productList;
    }


}
