package java17;

public class EnhancedSwitch {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        int k=4;
        String s=switch (k){
            case 1,2,3 -> "numbers were less tan 5";
            case 10,11,12 -> "numbers greater than 10";
            default -> "dolla";
        };
        System.out.println(s);
        //passing condition
        int k1=20;
        String s1=switchcondition(k1);
        System.out.println(s1);
        guardedpatterns("edo");

    }
    public static String switchcondition(Object obj){
        return switch (obj){
            case Integer i->i%2==0?"even":"odd";
            case String s when s.length()>5 ->"long String";
                default -> "dolla";
        };
    }
    public static void guardedpatterns(Object obj){
         switch (obj){
            case String s when s.length()>5 -> System.out.println("Long String");
             case String s when s.length()<5 -> System.out.println("short String");
            default -> System.out.println("dolla");
        };
    }
}
