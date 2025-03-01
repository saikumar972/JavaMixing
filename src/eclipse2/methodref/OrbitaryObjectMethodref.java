package methodref;

import java.util.Arrays;
import java.util.function.Function;

public class OrbitaryObjectMethodref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, String> fun= (t) ->t.toLowerCase();
		System.out.println(fun.apply("RAJVEER"));
		//we use the method of argument
		Function<String, String> fun1= String::toLowerCase;
		System.out.println(fun1.apply("NANDA"));
		//using array
		String[] strArray= {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
		Arrays.sort(strArray, (s1,s2)-> s1.compareToIgnoreCase(s2));
		//using method ref
		Arrays.sort(strArray, String::compareToIgnoreCase);
	}
}
