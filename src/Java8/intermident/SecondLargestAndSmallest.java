package Java8.intermident;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr={1,2,233,242,23423,2,1,1};
        int secondMin = Arrays.stream(arr).distinct()
                .sorted()
                .skip(1)
                .findFirst().getAsInt();
        System.out.println(secondMin);
        //second max
        Integer secondMax = Arrays.stream(arr).distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondMax);
    }
}
