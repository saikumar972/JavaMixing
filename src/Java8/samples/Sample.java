package Java8.samples;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<String>  fruitList= Arrays.asList("sapota","apple","mangos","pineapple");
        List<String> list = fruitList.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(list);
        List<String> list2 = fruitList.stream().sorted(Comparator.comparingInt(String::length)).toList();
        //sort the list od=f string based on the first occurrence of 'e' the each string
        List<String> stringList=Arrays.asList("sample","correct","okye","employe");
        List<String> sortedList=stringList.stream().sorted(Comparator.comparing(s->s.indexOf('e'))).toList();
        System.out.println(sortedList);
        //sort in case Insensitive;
        List<String> l1=Arrays.asList("BanaEn","Apple","CUCUMBER","Sampled");
        Comparator<String> caseInsentiviveComparator=String.CASE_INSENSITIVE_ORDER;
        l1.sort(caseInsentiviveComparator);
        System.out.println(l1);
        List<LocalDate> localDates=Arrays.asList(LocalDate.of(1999,8,20),
                LocalDate.of(2000,8,20),
                LocalDate.of(1999,8,21));
        Collections.sort(localDates);
        System.out.println(localDates);

    }
}
