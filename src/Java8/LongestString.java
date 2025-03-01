package Java8;

import java.util.Arrays;
import java.util.Comparator;

public class LongestString {
    public static void main(String[] args) {
        String[] s1={"sai","kumar","saikumar"};
        String s = Arrays.stream(s1)
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println(s);
    }
}
