package repository;

import bean.Employee;
import bean.User;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();
    void add(Employee employee) throws SQLException;

    List<Employee> search(String keyword);

    void delete(int id) throws SQLException;

    void edit(Employee employee) throws SQLException;

     Employee getById(int id);

}
