package eclipse1.arrayListt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsSample {
	public static void main(String[] args) {
		Collection<Integer> collection=new ArrayList<Integer>();
		collection.add(12);
		collection.add(21);
		collection.add(13);
		collection.add(14);
		Iterator<Integer> interator =collection.iterator();
		while(interator.hasNext()) {
			System.out.println(interator.next());
		}
		collection.remove(12);
		System.out.println(collection);
		System.out.println(collection.contains(21));
		System.out.println(collection.isEmpty());
		System.out.println(collection.size());
	}
}
