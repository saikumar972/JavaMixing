package SingletonJava;

import java.io.*;

public class FilesSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f1=File.getInstance();
        //outputstream
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(("sample.ser")));
        obj.writeObject(f1);
        obj.close();
        //input
        ObjectInputStream obj2=new ObjectInputStream(new FileInputStream(("sample.ser")));
        File f3=(File)obj2.readObject();
        obj2.close();
        System.out.println(f1.hashCode());
        System.out.println(f3.hashCode());
    }
}
class File implements Serializable{
    public static File f;
    private File(){

    }
    protected Object readResolve(){
        return f;
    }
    public static  synchronized File getInstance(){
        if(f==null){
            f=new File();
        }
        return f;
    }
}
