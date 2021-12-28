package repository.Impl;

import bean.User;
import repository.IURepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class URepositoryImpl implements IURepository {

    @Override
    public void insertUser(User user) throws SQLException {

    }

    @Override
    public User selectUser(int id) {
        return null;
    }

    @Override
    public List<User> selectAllUsers() {
        return null;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return false;
    }
}
