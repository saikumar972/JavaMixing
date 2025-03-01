package Java8.simpleones;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringInAnArray {
    public static void main(String[] args) {
        String[] str={"sai","kumar","saikumar","katta"};
        //approach 1
        String s1 = Arrays.stream(str)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .findFirst().get();
        System.out.println(s1);
        //approach 2
        String s2 = Arrays.stream(str)
                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2)
                .get();
        System.out.println(s2);
        //approach 3
        String s3=Arrays.stream(str)
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println(s3);
        //approach 4
        String s4=Arrays.stream(str)
                .sorted((ss1,ss2)->Integer.compare(ss2.length(),ss1.length()))
                .findFirst()
                .get();
        System.out.println(s4);

    }
}
