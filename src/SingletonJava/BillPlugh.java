package SingletonJava;

public class BillPlugh {
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.method();
        SingletonClass s2 = SingletonClass.method();
        System.out.println(s1==s2);
    }
}
class SingletonClass{
    private SingletonClass(){

    }
    private static class Helper{
        private static final SingletonClass instance= new SingletonClass();
    }
    public static SingletonClass method(){
        return Helper.instance;
    }
}
