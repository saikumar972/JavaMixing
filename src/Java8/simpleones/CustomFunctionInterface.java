package Java8.simpleones;

public class CustomFunctionInterface {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        Sum sum=(x,y)->x+y;
        //Sum sum1=Integer::sum;
        System.out.println(sum.add(a,b));

    }
}
@FunctionalInterface
interface Sum{
    int add(int x,int y);
}
