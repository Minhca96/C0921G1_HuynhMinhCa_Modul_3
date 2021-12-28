package service.Impl;

import bean.User;
import repository.IUserR;
import repository.Impl.UserRImpl;
import service.IUserS;

import java.sql.SQLException;
import java.util.List;

public class UserSImpl implements IUserS {
    IUserR iUserR = new UserRImpl();
    @Override
    public List<User> FindAll() throws SQLException {
       return iUserR.FindAll();

    }

    @Override
    public List<User> search(String country){
    return iUserR.search(country);

    }
}
