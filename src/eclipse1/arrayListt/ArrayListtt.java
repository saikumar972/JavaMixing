package eclipse1.arrayListt;

import java.util.*;

public class ArrayListtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add(null);
		System.out.println(list);
		System.out.println(list.get(1));
		//creating ArrayList from another collection
		Collection<String> collection=new ArrayList<String>();
		collection.add("six");
		collection.add("seven");
		collection.add("eight");
		collection.add("nine");
		List<String> list1=new ArrayList<String>(list);
		System.out.println(list1);
		//Adding list elements to list1
		list1.addAll(collection);
		System.out.println(list1);
		//modify an element in array list
		list1.set(3, "Threeee");
		System.out.println(list1);
		//remove element in array list using index
		list1.remove(3);
		System.out.println(list1);
		//remove using object
		list1.removeAll(collection);
		System.out.println(list1);
		//remove element in array list using object
		list1.remove("five");
		System.out.println(list1);
		//different ways of iterating list
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("------------");
		Iterator<String> interator=list1.iterator();
		while(interator.hasNext()){
			System.out.println(interator.next());
		}
		System.out.println("------------");
		list1.forEach(k-> System.out.println(k));
		System.out.println("------------");
		for(String k1 : list1) {
			System.out.println(k1);
		}
		System.out.println("------------");
		for(Iterator<String> interator1=list1.iterator();interator1.hasNext();) {
			String k=interator1.next();
			System.out.println(k);
		}
		System.out.println("=================");
		list1.stream().forEach(k1-> System.out.println(k1));
		
		//sorting cannot be done if the last element is null
		Collections.sort(list1, (o1,o2)->{
			if(o1==null && o2==null)
				return 0;
			if(o1==null)
				return 1;
			if(o2==null)
				return -1;
			return o1.compareTo(o2);
		});

		System.out.println(list1);
		list1.remove(null);
		Collections.sort(list1);
		System.out.println(list1);
		Collections.reverse(list1);
		System.out.println(list1);
		list1.sort(Comparator.reverseOrder());
		System.out.println(list1);
	}
}
