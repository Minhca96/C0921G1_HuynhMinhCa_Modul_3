package repository.Impl;

import bean.Customer;
import bean.CustomerType;
import repository.ICustomerRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    @Override
    public List<Customer> findAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        try {

            PreparedStatement statement = BaseRepository.connection.prepareStatement("select * from customer");
            ResultSet rs = statement.executeQuery();
            Customer customer = null;
            while (rs.next()) {
                int id = rs.getInt("customer_id");
                CustomerType customerTypeId = new CustomerType(rs.getInt("customer_type_id"));
                String name = rs.getString("customer_name");
                String birthDay = rs.getString("customer_birthday");
                String gender = rs.getString("customer_gender");
                String card = rs.getString("customer_id_card");
                String phone = rs.getString("customer_phone");
                String email = rs.getString("customer_email");
                String address = rs.getString("customer_address");
                customer = new Customer(id, customerTypeId, name, birthDay, gender, card, phone, email, address);

                customerList.add(customer);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    return customerList;
    }

    @Override
    public List<Customer> searchCustomer(String keyword) {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement("select *  from customer  where customer_name like ?");
            preparedStatement.setString(1,"%"+keyword+"%");
            ResultSet rs = preparedStatement.executeQuery();


            Customer customer = null;
            while (rs.next()){
                int id = rs.getInt("customer_id");
                CustomerType customerTypeId = new CustomerType(rs.getInt("customer_type_id"));
                String name = rs.getString("customer_name");
                String birthDay = rs.getString("customer_birthday");
                String gender = rs.getString("customer_gender");
                String card = rs.getString("customer_id_card");
                String phone = rs.getString("customer_phone");
                String email = rs.getString("customer_email");
                String address = rs.getString("customer_address");
                customer = new Customer(id,customerTypeId,name,birthDay,gender,card,phone,email,address);
                customerList.add(customer);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }





    @Override
    public Customer getById(int id) {
        Customer customer = null;
        try {
            PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement("select * from customer where customer_id = ?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){

                CustomerType customerTypeId = new CustomerType(rs.getInt("customer_type_id"));
                String name = rs.getString("customer_name");
                String birthDay = rs.getString("customer_birthday");
                String gender = rs.getString("customer_gender");
                String card = rs.getString("customer_id_card");
                String phone = rs.getString("customer_phone");
                String email = rs.getString("customer_email");
                String address = rs.getString("customer_address");
                customer = new Customer(id,customerTypeId,name,birthDay,gender,card,phone,email,address);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    return  customer;
    }



    @Override
    public void edit(Customer customer) {


            try {
                PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(" update customer set  customer_type_id =?, " +
                " customer_name = ?, customer_birthday = ? ,customer_gender = ?, customer_id_card = ?, " +
                        " customer_phone = ?, customer_email = ?,customer_address = ?  where customer_id = ? ");
                preparedStatement.setInt(1,customer.getCustomerTypeId().getId());
                preparedStatement.setString(2,customer.getName());
                preparedStatement.setString(3,customer.getBirthDay());
                preparedStatement.setInt(4,Integer.parseInt(customer.getGender()));
                preparedStatement.setString(5,customer.getCard());
                preparedStatement.setString(6,customer.getPhone());
                preparedStatement.setString(7,customer.getEmail());
                preparedStatement.setString(8,customer.getAddress());
                preparedStatement.setInt(9,customer.getId());
                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        }

    @Override
    public void add(Customer customer) {

        try {
            PreparedStatement statement = BaseRepository.connection.prepareStatement(" insert into customer(customer_id,customer_type_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address) values(?,?,?,?,?,?,?,?,?)");
            statement.setInt(1,customer.getId());
            statement.setInt(2,customer.getCustomerTypeId().getId());
            statement.setString(3,customer.getName());
            statement.setString(4,customer.getBirthDay());
            statement.setInt(5,Integer.parseInt(customer.getGender()));
            statement.setString(6,customer.getCard());
            statement.setString(7,customer.getPhone());
            statement.setString(8,customer.getEmail());
            statement.setString(9,customer.getAddress());
            statement.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
