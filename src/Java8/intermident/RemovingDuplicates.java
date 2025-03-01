package Java8.intermident;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemovingDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,233,242,23423,2,1,1};
        List<Integer> collect = Arrays.stream(arr)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
