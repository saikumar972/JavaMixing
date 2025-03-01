package SingletonJava;

public class DoubleCheckLocking {
    public static void main(String[] args) {

    }
}
class Sampleddd{
    private static volatile Sampleddd s;
    private Sampleddd(){

    }
    public static  Sampleddd getInstance(){
        if(s==null){
            synchronized (Sampleddd.class){
                if(s==null){
                    s=new Sampleddd();
                }
            }
        }
        return s;
    }
}

