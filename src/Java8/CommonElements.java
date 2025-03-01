package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,3};
        int[] arr2={3,4,2,3};
        //common elements
        Set<Integer> intStream = Arrays.stream(arr1)
                .filter(a1 -> Arrays.stream(arr2).anyMatch(a2 -> a2 == a1))
                .boxed().collect(Collectors.toSet());
        System.out.println(intStream);
    }
}
