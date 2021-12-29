package service.Impl;

import bean.User;
import repository.IUR;
import repository.Impl.URImpl;
import service.IUS;

import java.sql.SQLException;
import java.util.List;

public class USImpl implements IUS {
    IUR ius = new URImpl();

    @Override
    public void insertUser(User user) throws SQLException {
        ius.insertUser(user);

    }

    @Override
    public User selectUser(int id) {
        return ius.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return ius.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return ius.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return ius.updateUser(user);
    }

    @Override
    public User getUserById(int id) {
        return ius.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
            ius.insertUserStore(user);
    }
}
