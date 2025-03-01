package SingletonJava;

public class CloningSingleton {
    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonClone s1=SingletonClone.method();
        System.out.println(s1.hashCode());
        SingletonClone s2=(SingletonClone) s1.clone();
        System.out.println(s2.hashCode());
    }
}
class SingletonClone extends Cloning{
    private static SingletonClone clone;
    private SingletonClone(){

    }
    //adding below method to prevent cloning
    @Override
    protected  Object clone() throws CloneNotSupportedException{
        return new CloneNotSupportedException("cloning not possile");
    }
    public static synchronized SingletonClone method(){
        if(clone==null){
            clone=new SingletonClone();
        }
        return clone;
    }
}

class Cloning implements Cloneable{
    @Override
    protected  Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}