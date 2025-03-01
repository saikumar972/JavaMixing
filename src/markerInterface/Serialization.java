package markerInterface;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student=new Student(1,"sai");
        //adding(student);
        fetching();
    }
    public static void adding(Student student) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\Downloads\\dummy\\dummy.txt");
        ObjectOutputStream obj=new ObjectOutputStream(fileOutputStream);
        obj.writeObject(student);
        obj.close();
        fileOutputStream.close();
        System.out.println("added");
    }
    public static void fetching() throws IOException, ClassNotFoundException {
        Student student=null;
        FileInputStream file=new FileInputStream("D:\\Downloads\\dummy\\dummy.txt");
        ObjectInputStream obj=new ObjectInputStream(file);
        student= (Student) obj.readObject();
        System.out.println(student);
        obj.close();
        file.close();

        System.out.println("data fetched");
    }
}

class Student implements Serializable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
