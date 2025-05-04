package designpatterns.builder.builder2;

public class Director {
    StudentBuilders studentBuilder;
    Director(StudentBuilders studentBuilder){
        this.studentBuilder=studentBuilder;
    }
    public Student createStudent(){
        if (studentBuilder instanceof EngineeringStudent){
            return createEnginnering();
        }else{
            return createMBA();
        }
    }

    public Student createMBA() {
        return studentBuilder.
                setName("mmbawala")
                .setDept("admin")
                .setId(6969)
                .setSubjects().builder();
    }

    public Student createEnginnering() {
        return studentBuilder.
                setName("nanda")
                .setDept("cse")
                .setId(6969)
                .setSubjects().builder();
    }
}
