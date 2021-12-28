package repository;

import bean.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserR {
    List<User> FindAll() throws SQLException;


    List<User> search(String country);
}
