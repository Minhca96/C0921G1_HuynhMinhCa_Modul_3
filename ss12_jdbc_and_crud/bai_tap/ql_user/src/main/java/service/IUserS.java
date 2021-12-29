package service;

import bean.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserS {
    List<User> FindAll();
    List<User> search(String country);
    List<User> sort();
}
