package repository.Impl;

import bean.*;
import repository.IEmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {



    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();

        try {

            Statement statement = BaseRepository.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee");
             Employee employee = null;
            while (resultSet.next()){
                employee = new Employee();
                employee.setId(resultSet.getInt("employee_id"));
                employee.setName(resultSet.getString("employee_name"));
                employee.setBirthDate(resultSet.getString("employee_birthday"));
                employee.setCard(resultSet.getString("employee_card"));
                employee.setSalary(resultSet.getString("employee_salary"));
                employee.setPhone(resultSet.getString("employee_phone"));
                employee.setEmail(resultSet.getString("employee_mail"));
                employee.setAddress(resultSet.getString("employee_address"));
                employee.setPositionId(new Position(resultSet.getInt("position_id")));
                employee.setEducationDegreenId(new EducationDegree(resultSet.getInt("education_degree_id")));
                employee.setDivisionId(new Division(resultSet.getInt("divition_id")));
                employee.setUserName( null);
                employeeList.add(employee);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void add(Employee employee)  {

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = BaseRepository.connection.prepareStatement( " insert into employee(employee_id,employee_name,employee_birthday, " +
                    " employee_card,employee_salary,employee_phone,employee_mail, " +
                    " employee_address,position_id,education_degree_id,divition_id,username) " +
                    " value (?,?,?,?,?,?,?,?,?,?,?,?) ");

            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getBirthDate());
            preparedStatement.setString(4, employee.getCard());
            preparedStatement.setString(5, employee.getSalary());
            preparedStatement.setString(6,employee.getPhone());
            preparedStatement.setString(7,employee.getEmail());
            preparedStatement.setString(8,employee.getAddress());
            preparedStatement.setInt(9,employee.getPositionId().getId());
            preparedStatement.setInt(10,employee.getEducationDegreenId().getId());
            preparedStatement.setInt(11,employee.getDivisionId().getId());
            preparedStatement.setString(12,null);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }

    @Override
    public List<Employee> search(String keyword) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = null;
        try {

            CallableStatement callableStatement = BaseRepository.connection.prepareCall(" select *  from employee  where employee_name like ? or employee_id like ? ");
            callableStatement.setString(1,"%"+keyword+"%");
            callableStatement.setString(2,"%"+keyword+"%");

            ResultSet rs = callableStatement.executeQuery();

            while (rs.next()){

             int id =rs.getInt("employee_id");
            String name  = rs.getString("employee_name");
            String birthDate = rs.getString("employee_birthday");
            String card = rs.getString("employee_card");
            String salary = rs.getString("employee_salary");
            String phone = rs.getString("employee_phone");
            String email = rs.getString("employee_mail");
            String address = rs.getString("employee_address");
            Position positionId = new Position(rs.getInt("position_id"));
            EducationDegree educationDegreenId = new EducationDegree(rs.getInt("education_degree_id"));
            Division divisionId = new Division(rs.getInt("divition_id"));
            User userName = null;

            employee = new Employee(id,name,birthDate,card,salary,phone,email,address,positionId,educationDegreenId,divisionId,userName);
            employeeList.add(employee);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void delete(int id) throws SQLException {
        PreparedStatement statement = BaseRepository.connection.prepareStatement("delete from employee where employee_id = ?");
        statement.setInt(1,id);
        statement.executeUpdate() ;

    }

    @Override
    public void edit(Employee employee) throws SQLException {

        PreparedStatement statement = BaseRepository.connection.prepareStatement(" update employee set employee_name= ?, employee_birthday =?, " +
                " employee_card = ?, employee_salary = ? ,employee_phone = ?, employee_mail = ?, " +
                " employee_address = ?, position_id = ?,education_degree_id = ? , divition_id = ?,  username = ? where employee_id = ?");

       statement.setString(1,employee.getName());
       statement.setString(2,employee.getBirthDate());
       statement.setString(3,employee.getCard());
       statement.setString(4,employee.getSalary());
       statement.setString(5,employee.getPhone());
       statement.setString(6,employee.getEmail());
       statement.setString(7,employee.getAddress());
       statement.setInt(8,employee.getPositionId().getId());
       statement.setInt(9,employee.getEducationDegreenId().getId());
       statement.setInt(10,employee.getDivisionId().getId());
       statement.setString(11,null);
        statement.setInt(12,employee.getId());
       statement.executeUpdate();
    }

    @Override
    public Employee getById(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement("select * from employee where employee_id = ?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
                    while (rs.next()){


                String name = rs.getString("employee_name");
                String birthDate = rs.getString("employee_birthday");
                String card = rs.getString("employee_card");
                String salary = rs.getString("employee_salary");
                String phone = rs.getString("employee_phone");
                String email = rs.getString("employee_mail");
                String address = rs.getString("employee_address");
                Position positionId = new Position(rs.getInt("position_id"));
                EducationDegree educationDegreenId = new EducationDegree(rs.getInt("education_degree_id"));
                Division divisionId = new Division(rs.getInt("divition_id"));
                User userName = null;
                        return  new Employee(id, name, birthDate, card, salary, phone, email, address, positionId, educationDegreenId, divisionId, userName);

                    }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return null;
    }









//    public static void main(String[] args) {
//        IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
//        for (Employee e: iEmployeeRepository.findAll()) {
//
//            System.out.println(e);
//        }
//        try {
//            iEmployeeRepository.add(new Employee(11,"Sang","1996-03-01","2006778","10000000","09745677","sang@","quang nam",null,null,null,null));
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }


}
