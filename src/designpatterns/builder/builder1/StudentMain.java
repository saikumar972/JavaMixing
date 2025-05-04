package designpatterns.builder.builder1;

public class StudentMain {
    public static void main(String[] args) {
        Student s1= new Student.StudentBuilder()
                .setId(1)
                .setName("rajveer")
                .setPocketMoney(200)
                .setSubject("edo")
                .studentBuild();

        System.out.println(s1);
    }
}
