package functionalinterface;

import java.util.function.Function;

class Functionimpl implements Function<String, Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}
public class Functionmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> function=new Functionimpl();
		System.out.println(function.apply("sareeee"));
		//lambda
		Function<String, Integer> function1=(t) ->t.length();
		System.out.println(function1.apply("saikumar"));
	}

}
