package Java8.simpleones;

import java.util.Arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,322,22};
        int sum = Arrays.stream(arr)
                .sum();
        System.out.println(sum);
        Double average = Arrays.stream(arr)
                .average().getAsDouble();
        System.out.println(average);
        //using reduce
        Integer reduce = Arrays.stream(arr)
                .reduce((a, b) -> (a + b) / 2).getAsInt();
        System.out.println(reduce);
    }
}
