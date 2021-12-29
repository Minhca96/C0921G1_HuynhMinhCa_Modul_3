package repository.Impl;

import bean.User;
import repository.BaseRepository;
import repository.IUserR;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRImpl implements IUserR {

    @Override
    public List<User> FindAll() {
        List<User> userList = new ArrayList<>();

        try {
            Statement statement = BaseRepository.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user_khach_hang.username");

            User user = null;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getNString("country"));
                userList.add(user);
            }

        } catch (SQLException throwables) {
            throwables.fillInStackTrace();
        }

        return userList;
    }


    @Override
    public List<User> search(String countries) {


        List<User> users = new ArrayList<>();

        try  {
            Connection connection = BaseRepository.connection;
            PreparedStatement preparedStatement
                    = connection.prepareStatement("SELECT * FROM username where country like ?");
            preparedStatement.setString(1,"%"+countries+"%");

            ResultSet rs = preparedStatement.executeQuery();


            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users.add(new User(id, name, email, country));
            }
        } catch (SQLException e) {
            e.fillInStackTrace();

        }

        return users;

    }

    @Override
    public List<User> sort() {
       List<User> userList = new ArrayList<>();
        try {
            Statement statement = BaseRepository.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from username order by name");
             User user = null;
            while (resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }




}