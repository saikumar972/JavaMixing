package patterns;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PttaernWala {
    public static void main(String[] args) {
        String k="i love java. Java is Object Oriented Programming.";
        String collect = Arrays.stream(k.split(" "))
                .filter(word -> word.toLowerCase().matches("^[aeiou].+")).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
