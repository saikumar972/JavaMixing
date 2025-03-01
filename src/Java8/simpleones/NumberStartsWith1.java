package Java8.simpleones;

import java.util.Arrays;
import java.util.List;

public class NumberStartsWith1 {
    public static void main(String[] args) {
        int [] numbers={1,21,43,12};
        //approach 1
        List<Integer> list = Arrays.stream(numbers)
                .boxed()
                .filter(num -> num.toString().charAt(0) == '1')
                .toList();
        System.out.println(list);
        //approach 2
        List<String> list1 = Arrays.stream(numbers)
                .boxed()
                .map(i -> i + "")
                .filter(str -> str.startsWith("1"))
                .toList();
        System.out.println(list1);
    }
}
