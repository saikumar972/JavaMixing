package designpatterns.builder.builder2;

public class BuilderMain {
    public static void main(String[] args) {
        StudentBuilders studentBuilder= new EngineeringStudent();
        Student student=studentBuilder.
                setDept("softare")
                .setId(6969)
                .setName("nanda")
                .setSubjects()
                .builder();
        System.out.println(student);

        StudentBuilders studentBuilders= new MBAStudent();
        Director director=new Director(studentBuilders);
        Student student1=director.createStudent();
        System.out.println(student1);
    }
}
