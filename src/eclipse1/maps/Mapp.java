package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(null, "five");
		map.put(null, "six");
		map.put(5, "four");
		System.out.println(map);
		map.remove(null);
		map.remove(5, "four");
		System.out.println(map);
		System.out.println(map.get(3));
		//retrieving keys
		Set<Integer> set=map.keySet();
		System.out.println(set);
		Collection<String> list= map.values();
		System.out.println(list);
		
		//accessing map elements
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
		}
		//using iterator
		Set<Map.Entry<Integer, String> > entries=map.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator=entries.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry=iterator.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		//simple one
		map.forEach(((k,v)->System.out.println(k+v)));
	}

}
