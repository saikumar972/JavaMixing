package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Streambasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> s= Stream.of("sare","ok","pandago");
		//to print stream elements
		//s.forEach((s1)-> System.out.println(s1));
		//or methodref stream can be only used once
		s.forEach(System.out::println);
		System.out.println("===============================");
		//stream from collection similarly from list set 
		Collection<String> c=Arrays.asList("sare","ok","pandago");
		Stream<String> ss=c.stream();
		ss.forEach(System.out::println);
		//Stream from arrays
		String[] string= {"okok","ol","nanda"};
		Stream<String> sss=c.stream();
	}
}
