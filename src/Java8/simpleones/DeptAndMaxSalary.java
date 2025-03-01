package Java8.simpleones;

import Java8.database.EmployeeDB;
import Java8.database.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeptAndMaxSalary {
    public static void main(String[] args) {
        List<EmployeeData> employeeList = EmployeeDB.employeeDB();
        Map<String, Optional<EmployeeData>> collect1 = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                EmployeeData::getDepartment,
                                Collectors.maxBy(Comparator.comparingDouble(EmployeeData::getSalary))
                        )
                );
        System.out.println(collect1);
        //approach 2
        Map<String, String> collect2 = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                EmployeeData::getDepartment,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(EmployeeData::getSalary)), optional -> optional.get().getName())
                        )
                );
        System.out.println(collect2);
        //approach 3
//        employeeList.stream()
//                .map(
//                        EmployeeData::getDepartment,
//                        EmployeeData::getName,
//                );

    }
}
