package Java8.intermident;

import java.util.Arrays;
import java.util.List;

public class Squares {
    public static void main(String[] args) {
        int[] arr={1,2,13,21,32};
        List<Double> list = Arrays.stream(arr)
                .mapToDouble(i -> Math.pow(i,2))
                .boxed()
                .toList();
        System.out.println(list);
        //sum
        double sum = Arrays.stream(arr)
                .mapToDouble(i -> Math.pow(i, 2))
                .sum();
        System.out.println(sum);
    }
}
