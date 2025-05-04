package designpatterns.builder.builder2;

import java.util.ArrayList;
import java.util.List;

public abstract class StudentBuilders {
    public int id;
    public String name;
    public String dept;
    public List<String> subjects;
    public StudentBuilders setId(int id){
        this.id=id;
        return this;
    }
    public StudentBuilders setName(String name){
        this.name=name;
        return this;
    }
    public StudentBuilders setDept(String dept){
        this.dept=dept;
        return this;
    }
    abstract public StudentBuilders setSubjects();
    public Student builder(){
        return new Student(this);
    }
}
