package designpatterns.prototype.prototype1;

public class PrototypeMain {
    public static void main(String[] args) {
        Student s1= new Student(1,"sai","cc");
        Student s2=(Student) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("-------------------");
    }
}
