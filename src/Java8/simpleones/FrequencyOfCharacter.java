package Java8.simpleones;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String k="saikumarkatta";
        Map<Character,Integer> map=new HashMap<>();
        for(Character c:k.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        //using java8 approach 1
        Map<String,Long> map2 = Arrays.stream(k.split(""))
                .collect(
                        Collectors.groupingBy(Function.identity(),
                                Collectors.counting()));
        System.out.println(map2);
        //java 8 approach 2
        Map<Character, Long> map3 = k.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map3);
        //java 8 approach 3
        Map<String, Long> map4 = Arrays.stream(k.split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(map4);
        //duplicate elements in String
        for(Map.Entry<String,Long> localMap:map4.entrySet()) {
            if (localMap.getValue() > 1) {
                System.out.println(localMap);
            }
        }
        //non duplicate elements in String approach 2
        List<String> duplicates = Arrays.stream(k.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(mapp -> mapp.getValue() == 1)
                .map(key -> key.getKey())
                .collect(Collectors.toList());
        System.out.println(duplicates);
        //first non repeated element
        String key = Arrays.stream(k.split(""))
                .collect(Collectors.groupingBy(str -> str,LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(key);
    }
}
