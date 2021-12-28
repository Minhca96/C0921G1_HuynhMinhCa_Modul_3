package repository.Impl;

import bean.User;
import repository.BaseRepository;
import repository.IUserR;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRImpl implements IUserR {
    public static Connection connection;
    private static String jdbcURL = "jdbc:mysql://localhost:3306/user_khach_hang";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "01021996";

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
    public List<User> search(String countries) {

//        Statement statement = BaseRepository.connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(");
        List<User> users = new ArrayList<>();
        // Step 1: Establishing a Connection
        try  {
            Connection connection = getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement
                    = connection.prepareStatement("SELECT * FROM username where country like ?") ;
            preparedStatement.setString(1,"%"+countries+"%");
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users.add(new User(id, name, email, country));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
//        "SELECT * FROM username where country like ?;"
//        List<User> userss = new ArrayList<>();
//        for (User user : users) {
//            if (user.getCountry().toLowerCase().contains(countries)) {
//                userss.add(user);
//            }
//        }
        return users;

    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
//    public static void main(String[] args) {
//        UserRImpl userR = new UserRImpl();
//        System.out.println(userR.FindAll());
//
//    }
            }
        }
    }
}