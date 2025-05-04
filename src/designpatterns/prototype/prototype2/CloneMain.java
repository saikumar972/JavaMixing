package designpatterns.prototype.prototype2;

public class CloneMain {
    public static void main(String[] args) {
        Address address1= new Address("Prakasam","AP");
        Student student1=new Student(1,"sai",address1);
        System.out.println(student1);
        System.out.println("---------------------------------------------------");
        Student clonedStudent=student1.clone();
        System.out.println(clonedStudent);
        System.out.println("---------------After setting address in original-------------------------------------------");
        address1.setDistrict("Srikakulam");
        System.out.println(student1);
        System.out.println(clonedStudent);
        System.out.println("-------------------------After setting address in clone----------------------------------------");
        clonedStudent.getAddress().setDistrict("Godavari");
        System.out.println(student1);
        System.out.println(clonedStudent);
    }
}
