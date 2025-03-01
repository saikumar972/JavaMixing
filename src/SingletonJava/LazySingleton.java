package SingletonJava;

public class LazySingleton {
    public static void main(String[] args) {
        Sampled s1=Sampled.getInstance();
        System.out.println(s1.hashCode());
        Sampled s2=Sampled.getInstance();
        System.out.println(s2.hashCode());
    }
}
 class Sampled{
    private static Sampled s;
    private Sampled(){

    }
    public static Sampled getInstance(){
        if(s==null){
             s=new Sampled();
            // return s;
        }
        return s;
    }
}
