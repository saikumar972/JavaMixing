package Java8.advanced;

import Java8.database.EmployeeDB;
import Java8.database.EmployeeData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOfMap {
    public static void main(String[] args) {
        List<EmployeeData> employeeDataList= EmployeeDB.employeeDB();
         employeeDataList.stream()
                .collect(Collectors.groupingBy(EmployeeData::getDepartment,
                        Collectors.groupingBy(EmployeeData::getCity)))
                 .forEach((k,v)->{
                     System.out.println("Department is "+k);
                     v.forEach((k1,v1)->{
                         System.out.println("City is "+k1);
                         System.out.println("Employee details are "+v1);
                     });
                 });

    }
}
