package methodref;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodreftoStaticMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Taking function interface
		Function<Integer, Double> fun= (x) -> Math.sqrt(x);
		System.out.println(fun.apply(25));
		//Since sqrt is a static method
		Function<Integer, Double> fun1= Math::sqrt;
		System.out.println(fun1.apply(36));
		//normal static method
		BiFunction<Integer, Integer, Integer> bifun=(a,b) -> MethodreftoStaticMethod.addition(a, b);
		System.out.println(bifun.apply(10, 20));
		//using method ref
		BiFunction<Integer, Integer, Integer> bifun1=MethodreftoStaticMethod::addition;
		System.out.println(bifun1.apply(100, 20));
	}
	//declare a static method
	public static int addition(int a, int b) {
		return a+b;
	}
}
