package serializationInJava;

import java.io.*;

public class CustomExternalization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serialization
        Laptop laptop=new Laptop(1,"hp");
        System.out.println(laptop.hashCode());
        String fileName="laptop";
        serialization(laptop,fileName);
        //deserialization
        Laptop deserializedLaptop=deserializingLaptop(fileName);
        System.out.println(deserializedLaptop);
        System.out.println(deserializedLaptop.hashCode());
    }

    private static void serialization(Externalizable laptop, String fileName) throws IOException {
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(fileName));
        objectOutputStream.writeObject(laptop);
    }

    private static Laptop deserializingLaptop(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(fileName));
        return (Laptop) objectInputStream.readObject();

    }

}
class Laptop implements Externalizable {
    private int id;
    private String name;

    public Laptop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Laptop() {
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
         id=in.readInt();
         name= in.readUTF();
    }

}