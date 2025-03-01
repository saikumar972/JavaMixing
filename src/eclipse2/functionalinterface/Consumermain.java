package functionalinterface;
import java.util.function.Consumer;
//consumer interface is used to print the value which we passed in the parameter
class Consumerimpl implements Consumer<String>{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t.toLowerCase());
	}
}
public class Consumermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer=new Consumerimpl();
		consumer.accept("SAIKUMAR");
		//lambda
		Consumer<String> consumer1=(k) -> System.out.println(k.toUpperCase());
		consumer1.accept("Rajveer nanda");
		//method ref
		Consumer<String> consumer2=System.out::println;
		consumer2.accept("Rajveer vvnanda");
	}
}
