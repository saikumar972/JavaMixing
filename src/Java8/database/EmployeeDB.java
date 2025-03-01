package Java8.database;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeDB{
    public static List<EmployeeData> employeeDB(){
        return Stream.of(new EmployeeData(1,"sai","java",2000,"pune"),
                new EmployeeData(2,"kumar","c",4000,"pune"),
                new EmployeeData(4,"katta","c++",7000,"kochi"),
                new EmployeeData(6,"rajveer","java",8700,"hyderabad"),
                new EmployeeData(8,"nanda","java",8000,"hyderabad"),
                new EmployeeData(9,"sai","c",4300,"mumbai"),
                new EmployeeData(3,"kumar","c++",8000,"mumbai"),
                new EmployeeData(21,"pardhu","java",3200,"hyderabad")).toList();
    }
}