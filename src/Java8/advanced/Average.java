package Java8.advanced;

import Java8.database.EmployeeDB;
import Java8.database.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Average {
    public static void main(String[] args) {
        List<EmployeeData> list=EmployeeDB.employeeDB();
        //average by language
        Map<String, Double> collect = list.stream()
                .collect(Collectors.groupingBy(EmployeeData::getDepartment,
                        Collectors.collectingAndThen(Collectors.averagingDouble(EmployeeData::getSalary),
                                result -> result.doubleValue())));
        System.out.println(collect);

        //highest salary in each department
        Map<String, EmployeeData> collect1 = list.stream()
                .collect(Collectors.groupingBy(EmployeeData::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(EmployeeData::getSalary)), optional -> optional.get())));
        System.out.println(collect1);
        //highest salary name
        Map<String, String> collect2 = list.stream()
                .collect(Collectors.groupingBy(EmployeeData::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(EmployeeData::getSalary)), optional -> optional.get().getName())));
        System.out.println(collect2);
        //second highest salary name
       String name = list.stream()
                .sorted(Comparator.comparingDouble(EmployeeData::getSalary).reversed())
                .skip(1)
                .map(student->student.getName())
               .findFirst().get();
        System.out.println(name);
        //department with highest average salary
        Map.Entry<String, Double> stringDoubleEntry = list.stream()
                .collect(Collectors.groupingBy(EmployeeData::getDepartment, Collectors.averagingDouble(EmployeeData::getSalary)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue(Comparator.reverseOrder()))
                .findFirst()
                .get();
        System.out.println(stringDoubleEntry);
    }
}
