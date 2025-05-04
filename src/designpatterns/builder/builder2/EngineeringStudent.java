package designpatterns.builder.builder2;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudent extends StudentBuilders {
    @Override
    public StudentBuilders setSubjects() {
        List<String> subjectList=new ArrayList<>();
        subjectList.add("java");
        subjectList.add("python");
        subjectList.add("c++");
        this.subjects=subjectList;
        return this;
    }
}
