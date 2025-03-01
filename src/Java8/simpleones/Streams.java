package Java8.simpleones;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "pine", "coconut", "cocumber", "pineapple", "sapota", "summer");
        List<String> collect = list.stream()
                .map(k -> new StringBuffer(k).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(collect);
        //grouping by first letter
        Map<Character, List<String>> collect1 = list.stream()
                .collect(Collectors.groupingBy(k -> k.charAt(0)));
        System.out.println(collect1);
        System.out.println("-----------------");
        //grouping by last letter and value is the word starts with 'S'
        Map<Character, List<String>> s = list.stream()
                .filter(k1 -> k1.startsWith("s"))
                .collect(Collectors.groupingBy(k -> k.charAt(k.length() - 1)));
        System.out.println(s);
        //max
        Map<Integer, List<String>> collect2 = list.stream()
                .collect(Collectors.groupingBy(k -> k.length()));
        System.out.println(collect2);
    }
}
