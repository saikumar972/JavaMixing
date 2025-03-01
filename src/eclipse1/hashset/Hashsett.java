package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Hashsett {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("one");
		set.add("two");
		System.out.println(set);
		 Set<String> hashSet = new HashSet<>();
	        hashSet.add("one");
	        hashSet.add("two");
	        hashSet.add("three");
	        hashSet.add("four");
	        hashSet.add("five");

	        // Accessing elements by converting to an array
	        String[] array = hashSet.toArray(new String[0]);
	        for (int i = 0; i < array.length; i++) {
	            System.out.println(array[i]);
	        }
	        LinkedList<String> list=new LinkedList<String>(set);
	        System.out.println(list);
	        System.out.println("----------------------");
	        //removing lement using filter
	        set.stream().filter(k->!k.equals("one")).forEach(k->System.out.println(k));
	        System.out.println("---------------------");
	        LinkedHashSet<String> link=new LinkedHashSet<>();
	        link.add("one");
	        link.add("one");
	        link.add("two");
	        link.add("three");
	        link.add(null);
	        System.out.println(link);
	      
	        link.removeIf(e->e==null);
	        System.out.println(link);
	        
	        //iterator
	        Iterator<String> itr=hashSet.iterator();
	        while(itr.hasNext()) {
	        	System.out.println(itr.next());
	        }
	        System.out.println("-----------");
	        hashSet.forEach(System.out::println);
	}
}
