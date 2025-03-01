package eclipse1.arrayListt;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListt {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		//accepts null and duplicate values and maintain insertion order
		list.add(12);
		list.add(12);
		list.add(21);
		list.add(null);
		System.out.println(list);
		
		//get element from list
		System.out.println(list.get(0));
		//setting element
		list.set(0, null);
		
		//adding first and last
		list.addFirst(1233);
		list.addLast(123);
		System.out.println(list);
		
		//retreiving first and last element
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		//deleting first element
		System.out.println(list.removeFirst());;
		//sorting
		Collections.sort(list, (o1,o2)->{
			if(o1==null&&o2==null)
				return 0;
			if(o1==null)
				return 1;
			if(o2==null)
				return -1;
			return o1-o2;
		});
		System.out.println(list);
	}
}
