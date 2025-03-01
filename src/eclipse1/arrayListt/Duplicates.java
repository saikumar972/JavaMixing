package eclipse1.arrayListt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,42,24,2};
        Set<Integer> set=new HashSet<>();
        Set<Integer> collect = Arrays.stream(arr)
                .boxed()
                .filter(k -> !set.add(k))
                .collect(Collectors.toSet());
        System.out.println(collect);
        System.out.println("------------------");
        System.out.println(set);
        System.out.println("----------distinct------");
        List<Integer> distinct = Arrays.stream(arr).boxed().distinct().toList();
        System.out.println(distinct);

    }
}
