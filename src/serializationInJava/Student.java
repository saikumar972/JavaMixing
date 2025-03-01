package serializationInJava;

import java.io.*;
import java.util.Objects;

class Teacher implements Serializable {
    private int name;
    private transient String password;

    public Teacher(int name, String password) {
        this.name = name;
        this.password = password;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name=" + name +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Teacher teacher = (Teacher) object;
        return name == teacher.name && Objects.equals(password, teacher.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }
}
public class Student {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Teacher teacher=new Teacher(1,"password");
        try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("sample"))){
            obj.writeObject(teacher);
            System.out.println(teacher.hashCode());
        }
        ObjectInputStream obj=new ObjectInputStream(new FileInputStream("sample"));
        Teacher teacher1=(Teacher) obj.readObject();
        System.out.println(teacher1);
        System.out.println(teacher1.hashCode());
    }
}
