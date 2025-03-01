package Java8.advanced;

import java.util.Arrays;

public class Multiplication {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7};
        Integer i = Arrays.stream(arr)
                //.boxed()
                .reduce((a, b) -> a * b).getAsInt();
        System.out.println(i);
    }
}
