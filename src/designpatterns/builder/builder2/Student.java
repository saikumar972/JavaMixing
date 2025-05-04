package designpatterns.builder.builder2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final int id;
    private final String name;
    private final String dept;
    private final List<String> subjects;
    public Student(StudentBuilders builder){
        this.id=builder.id;
        this.name=builder.name;
        this.dept=builder.dept;
        this.subjects=builder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
