package Java8.simpleones;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Employee{
    private int id;
    private double salary;

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}
class EmployeeDatabase{
    public static List<Employee> employeeList(){
        return Stream.of(new Employee(1,2000),
                    new Employee(2,3000),
                new Employee(4,9000),
                new Employee(6,7000),
                new Employee(8,6000)).toList();
    }
}
public class Sortings {
    public static void main(String[] args) {
        //sorting based in descending
        List<Employee> employeeList=EmployeeDatabase.employeeList();
        List<Employee> list = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
        System.out.println(list);
        //top 3
        List<Employee> list1 = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .toList();
        System.out.println(list1);
        //less than 3rd salary
        List<Employee> list2 = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(3)
                .toList();
        System.out.println(list2);
        //less than 3rd salary
        List<Employee> list10 = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(3)
                .toList();
        System.out.println(list10);
        //sum of array elements using java 8
        int[] arr={1,2,4,5,3,3};
        long count2 = Arrays.stream(arr).reduce(0,(a,b)->a+b);
        int count=Arrays.stream(arr).sum();
        System.out.println(count+" "+count2);
        //soring List of Integers
        List<Integer> numbers=Arrays.asList(1,2,3,2,2,3,242,23124);
        List<Integer> list3 = numbers.stream()
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println(list3);
        //appraoch 2
        numbers.stream()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed()).toList();
        //since reversed only accepts int
    }
}
