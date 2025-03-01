package methodref;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Constructorref {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("pomo");
		list.add("ok");
		list.add("no");
		list.add("no");
		Function<List<String> ,Set<String>> fun=(fruits) -> new HashSet<>(fruits);
		System.out.println(fun.apply(list));
		//method ref
		Function<List<String> ,Set<String>> fun1=HashSet::new;
		System.out.println(fun1.apply(list));
	}
}
