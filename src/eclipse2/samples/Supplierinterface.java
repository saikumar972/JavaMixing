package samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
//import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
@FunctionalInterface
interface Sare{
	void emled(int k1);
}
 class Ok{
	public void display(int k) {
		System.out.println(k);
	}
}
public class Supplierinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Person> c=()-> new Person(1,"sai");
		System.out.println(c.get());
		
		Supplier<Double> suppliesRandom=()-> new Random().nextDouble();
		System.out.println(suppliesRandom.get());
		
		Function<Integer, Double> math=  Math::sqrt;
		System.out.println(math.apply(12));
		//static method
		Function<Integer, Integer> fun=(k)->Supplierinterface.something(k);
		System.out.println(fun.apply(12));
		
		Function<Integer, Integer> fun1=Supplierinterface::something;
		System.out.println(fun1.apply(11));
		
		//object to method
		Ok kk= new Ok();
		Sare ok=(k)-> kk.display(k);
		ok.emled(12);
		
		//argument method
		Function<String, String> funSring = (kkk)-> kkk.toLowerCase();
		System.out.println(funSring.apply("Rajveer nandaaaa"));
		
		//method ref Arrays
		List<Character> list= Arrays.asList('a','e','i','o','u','A','E','I','O','U');
		list.sort( (o1,o2)->o1.compareTo(o2));
		System.out.println(list);
		list.sort( Character::compareTo);
		System.out.println(list);
		//list.sort(null);
		
		//constructor based ref
		List<String> somelist= new ArrayList<String>(Arrays.asList("ok","notok","okok","sae","ok"));
		Function<List<String>, Set<String>> funnn= (listtt)-> new HashSet<>(listtt);
		System.out.println(funnn.apply(somelist));
		
		Function<List<String>, Set<String>> funnn2= HashSet::new;
		System.out.println(funnn2.apply(somelist));
		
	}
	private static int something(int k) {
		return k*k;
	}
	
	
}
