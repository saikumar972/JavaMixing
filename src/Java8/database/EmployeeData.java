package Java8.database;

import java.util.List;
import java.util.stream.Stream;


public class EmployeeData {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String city;

    public EmployeeData(int id, String name, String department, double salary,String city) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.city=city;
    }

    public EmployeeData() {
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}

