package serializationInJava;

import java.io.*;

public class CustomSerializable {
    public static void main(String[] args) {
        Electronic electronic = new Electronic(1, "Samsung");
        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("electronic.ser"))) {
            electronic.write(oos);
            System.out.println("Object serialized: " + electronic);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("electronic.ser"))) {
            Electronic deserializedElectronic = new Electronic();
             deserializedElectronic = deserializedElectronic.read(ois);
            System.out.println("Object deserialized: " + deserializedElectronic);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Electronic implements Serializable {
    private int id;
    private String name;

    public Electronic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Electronic() {
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void write(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.id);
        objectOutputStream.writeUTF(this.name);
    }

    public Electronic read(ObjectInputStream objectInputStream) throws IOException {
        int id=objectInputStream.readInt();
        String name=objectInputStream.readUTF();
        return new Electronic(id,name);
    }
}