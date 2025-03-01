package Java8.simpleones;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] numbers={2,1,3,2,5,6,3,6,2,2,8};
        //approach 1
        Integer i = Arrays.stream(numbers)
                .mapToObj(k -> k)
                .sorted()
                .skip(numbers.length - 2)
                .findFirst().get();
        System.out.println(i);
        //approach 2
        Integer i2 = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(i2);

    }
}
