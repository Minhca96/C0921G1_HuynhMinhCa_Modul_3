package bean;

import java.sql.Date;

public class Employee {
    private  int id;
    private String name;
    private String birthDate;
    private String card;
    private String salary;
    private String phone;
    private String email;
    private String address;
    private Position positionId;
    private EducationDegree educationDegreenId;
    private Division divisionId;
    private  User userName;

    public Employee() {
    }

    public Employee(int id, String name, String birthDate, String card, String salary, String phone, String email, String address, Position positionId, EducationDegree educationDegreenId, Division divisionId, User userName) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.card = card;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.positionId = positionId;
        this.educationDegreenId = educationDegreenId;
        this.divisionId = divisionId;
        this.userName = userName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public EducationDegree getEducationDegreenId() {
        return educationDegreenId;
    }

    public void setEducationDegreenId(EducationDegree educationDegreenId) {
        this.educationDegreenId = educationDegreenId;
    }

    public Division getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Division divisionId) {
        this.divisionId = divisionId;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", card='" + card + '\'' +
                ", salary='" + salary + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", positionId=" + positionId +
                ", educationDegreenId=" + educationDegreenId +
                ", divisionId=" + divisionId +
                ", userName=" + userName +
                '}';
    }
}
