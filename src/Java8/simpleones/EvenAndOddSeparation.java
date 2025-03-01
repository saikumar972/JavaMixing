package Java8.simpleones;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenAndOddSeparation {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,2,3,3,22211);
        Map<Boolean, List<Integer>> collect = list.stream()
                .collect(Collectors.partitioningBy(k -> k % 2 == 0));
        System.out.println(collect);
        //using arrays
        int[] arr={1,2,3,4,2,3,3,22211};
        Map<Boolean, List<Integer>> collect1 = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(k -> k % 2 == 0));
        System.out.println(collect1);
        //even and odd numbers in given range
        Map<Boolean, List<Integer>> collect2 = IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.partitioningBy(k -> k % 2 == 0));
        System.out.println(collect2);
    }
}
