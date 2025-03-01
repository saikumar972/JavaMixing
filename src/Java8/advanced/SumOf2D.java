package Java8.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOf2D {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2, 4, 3, 3),
                Arrays.asList(23, 2, 3, 24, 11, 1),
                Arrays.asList(2, 44, 242, 553, 23));
        int[][] arr = {{1, 2, 3, 4, 5, 3},
                {1, 2, 3, 4, 3, 5},
                {1, 6, 78, 9, 3, 5}};

        Stream<int[]> stream = Arrays.stream(arr);

        int sum = Arrays.stream(arr).flatMapToInt(a -> Arrays.stream(a)).sum();
        System.out.println(sum);

        //list of list sum
        int sum1 = list.stream()
                .flatMap(l -> l.stream())
                .mapToInt(Integer::intValue).sum();
        System.out.println(sum1);
    }
}
