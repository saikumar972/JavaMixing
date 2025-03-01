package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streamsorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=Arrays.asList("appke","banana","pomo","guava");
		List<String> sorted=fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sorted);
		//using labda
		List<String> sorted1=fruits.stream().sorted((o1,o2)-> o1.compareTo(o2)).toList();
		//or
		List<String> sorted2=fruits.stream().sorted().toList();
		System.out.println(sorted2);
		System.out.println("=======================================");
		List<String> desc=fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(desc);
		//using labda
		List<String> desc1=fruits.stream().sorted((o1,o2)-> o2.compareTo(o1)).toList();
		//or
		System.out.println(desc1);
		System.out.println("=======================================");
	}
}
