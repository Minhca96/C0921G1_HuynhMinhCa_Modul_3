package service.Impl;

import bean.Employee;
import common.Validate;
import repository.IEmployeeRepository;
import repository.Impl.EmployeeRepository;
import service.IEmployeeService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public Map<String, String >  add(Employee employee) {
        Map<String, String > employeeMassage = new HashMap<>();

        try {
            if (!Validate.regexIdCard(employee.getCard())){
                employeeMassage.put("msgId","Vui lòng nhập employee id card");
            }
            if(!Validate.regexEmail(employee.getEmail())){
                employeeMassage.put("msgEmail","Vui lòng nhập employee email");
            }

            //if dua thong tin cuoi
            if (employeeMassage.isEmpty()){
                iEmployeeRepository.add(employee);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeMassage;

    }

    @Override
    public List<Employee> search(String keyword) {
      return   iEmployeeRepository.search(keyword);

    }

    @Override
    public void delete(int id) throws SQLException {
         iEmployeeRepository.delete(id);
    }

    @Override
    public void edit(Employee employee) throws SQLException {
        iEmployeeRepository.edit(employee);
    }

    @Override
    public Employee getById(int id) {
        return iEmployeeRepository.getById(id);
    }


}
