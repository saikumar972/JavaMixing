package Java8.advanced;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMap {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7};
        Map<Integer, Integer> squares = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toMap(a -> a, b -> b * b));
        System.out.println(squares);
    }
}
