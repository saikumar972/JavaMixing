package designpatterns.builder.builder2;

import java.util.ArrayList;
import java.util.List;

public class MBAStudent extends StudentBuilders {
    @Override
    public StudentBuilders setSubjects() {
        List<String> subjectList=new ArrayList<>();
        subjectList.add("maths");
        subjectList.add("business");
        subjectList.add("admin");
        this.subjects=subjectList;
        return this;
    }
}
