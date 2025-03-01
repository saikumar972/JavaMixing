package Java8.simpleones;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergingSortedList {
    public static void main(String[] args) {
        List<Integer> list1=List.of(1,4,2,2,4,35,22);
        List<Integer> list2=List.of(15,33,23,332,54);
        List<Integer> sortedList = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
