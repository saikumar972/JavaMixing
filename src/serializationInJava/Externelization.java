package serializationInJava;

import java.io.*;

class School implements Externalizable {
    private String name;
    private String department;

    public School(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public School() {
    }
    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name); // Write the 'name' field
        out.writeUTF(department); // Write the 'department' field
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF(); // Read the 'name' field
        department = in.readUTF(); // Read the 'department' field
        System.out.println(name);
        System.out.println(department);
    }
}
class Externelization{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        School school=new School("ok","nook");
        serializeObject(school,"sampled");
        School school1=(School) deserializeObject("sampled");
        System.out.println(school1);
    }

    private static void serializeObject(Externalizable obj, String fileName) throws IOException {
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName));
        obj.writeExternal(out);
        out.close(); // Always close the stream
    }

    private static Object deserializeObject(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName));
        School school=new School();
        school.readExternal(in);
        in.close();
        return school;
    }
}