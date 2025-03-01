package SingletonJava;

public class SynchronizationSingleton {
    public static void main(String[] args) {

        Runnable task=()->{
            Sampledd s1=Sampledd.getInstance();
            System.out.println(Thread.currentThread().getName()+" Hashcode "+s1.hashCode());
        };
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        Thread t4 = new Thread(task, "Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class Sampledd{
    private static Sampledd s;
    private Sampledd(){

    }
    public static synchronized Sampledd getInstance(){
        if(s==null){
            s=new Sampledd();
            // return s;
        }
        return s;
    }
}
