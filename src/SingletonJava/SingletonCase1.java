package SingletonJava;
//eager intitlization
public class SingletonCase1 {
    public static void main(String[] args) {
        Sample s=Sample.getInstance();
        Sample s2=Sample.getInstance();
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }
}

 class Sample{
    public static Sample sample= new Sample();
    private Sample(){
    }
    public static Sample getInstance(){
        return sample;
    }

}
