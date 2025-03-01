package samples;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Functional implements Function<String, Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}
public class PredefinedFunctionalinterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> fun=new Functional();
		System.out.println(fun.apply("rajveernanda"));
		//lambda
		Function<Integer, Integer> fun1=(k)->k+12;
		System.out.println(fun1.apply(1222));
		//consumer
		Consumer<String> consume=(k)->System.out.println(k);
		consume.accept("just print asthe");
		//method ref
		Consumer<String> consume1=System.out::println;
		consume1.accept("just print anthe");
		//supplier
		Supplier<String> sup=()->"edo vokati";
		System.out.println(sup.get());

		System.out.println("------------");
		Supplier<Double> randomSupplier = () -> new Random().nextDouble();
        System.out.println(randomSupplier.get());
        
        System.out.println("------------");
		Supplier<Integer> ints = () -> 1;
        System.out.println(ints.get());
	}

}
