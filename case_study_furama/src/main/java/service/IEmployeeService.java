package service;

import bean.Employee;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface IEmployeeService {
    List<Employee> findAll();

    Map<String, String > add(Employee employee);

    List<Employee> search(String keyword);

   void delete(int id) throws SQLException;

    void edit(Employee employee) throws SQLException;

    Employee getById(int id);
}
