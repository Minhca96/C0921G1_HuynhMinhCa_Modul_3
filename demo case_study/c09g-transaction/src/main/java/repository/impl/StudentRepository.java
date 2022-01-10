package repository.impl;

import bean.Student;
import repository.IStudentRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {

    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();

        try {
            Statement statement = BaseRepository.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "select id, `name`, date_of_birth\n" +
                    "from student");

            Student studentObj = null;

            while(resultSet.next()) {
                studentObj = new Student();
                studentObj.setId(resultSet.getInt("id"));
                studentObj.setName(resultSet.getString("name"));
                studentObj.setDateOfBirth(resultSet.getString("date_of_birth"));

                studentList.add(studentObj);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return studentList;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public void save(Student student) {
        // Dang ky thong tin vao DB.
        try {
            PreparedStatement preparedStatement
                    = BaseRepository.connection.prepareStatement(
                            "insert into student(`name`, date_of_birth)\n" +
                                    "values (?, ?)");
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getDateOfBirth());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public String callTransaction() {
        String msg = "OK, transaction successfully!";
        Connection connection = BaseRepository.connection;

        try {
            connection.setAutoCommit(false);

            PreparedStatement pSInsertTypeOfClass =
                    connection.prepareStatement(
                            "insert into type_of_class (id, `name`)\n" +
                                    "values (?, ?)");
            pSInsertTypeOfClass.setString(1, "3");
            pSInsertTypeOfClass.setString(2, "Other");

            int rowAffect = pSInsertTypeOfClass.executeUpdate();

            PreparedStatement pSInsertClass =
                    connection.prepareStatement(
                            "insert into class (id, `name`, type_of_class_id)\n" +
                                    "values (?, ?, ?)");
            pSInsertClass.setString(1, "5");
            pSInsertClass.setString(2, "X0122G1");
            pSInsertClass.setString(3, "3");

            rowAffect += pSInsertClass.executeUpdate();

            if (rowAffect == 2) {
                PreparedStatement pSInsertStudent
                        = connection.prepareStatement(
                        "insert into student(`name`, date_of_birth, email, class_id) " +
                                "values (?, ?, ?, ?)");
                pSInsertStudent.setString(1, "Nguyen Van A");
                pSInsertStudent.setString(2, "2021-09-28");
                pSInsertStudent.setString(3, "anguyen@gmail.com");
                pSInsertStudent.setString(4, "99");

                rowAffect += pSInsertStudent.executeUpdate();
            }

            if (rowAffect == 3) {
                connection.commit();
            } else {
                msg = "rollback try";
                connection.rollback();
            }

        } catch (SQLException e) {
            try {
                msg = "rollback catch";
                connection.rollback();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return msg;
    }

    @Override
    public List<Student> findByKeyword(String keyword) {
        List<Student> studentList = new ArrayList<>();

        try {
            CallableStatement callableStatement =
                    BaseRepository.connection.prepareCall(
                            "call sp_find_student(?)");
            callableStatement.setString(1, keyword);

            ResultSet resultSet = callableStatement.executeQuery();

            Student studentObj = null;
            while(resultSet.next()) {
                studentObj = new Student();
                studentObj.setId(resultSet.getInt("id"));
                studentObj.setName(resultSet.getString("name"));
                studentObj.setDateOfBirth(resultSet.getString("date_of_birth"));

                studentList.add(studentObj);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return studentList;
    }
}
