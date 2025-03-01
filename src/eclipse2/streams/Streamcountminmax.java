package streams;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class Streamcountminmax {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> s=Stream.of(1,2,3,4,5,3);
		System.out.println(s.count());
		Stream<Integer> s1=Stream.of(1,2,3,4,5,3);
		Integer k=s1.min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(k);
		Stream<Integer> s2=Stream.of(1,2,3,4,5,3);
		Integer k2=s2.max(Comparator.comparing(Integer::valueOf)).orElseThrow(NoSuchElementException::new);
		System.out.println(k2);
		
		Stream<Integer> s3=Stream.of(1,2,3,4,5,3);
		Integer k3=s3.max((a, b) -> Integer.valueOf(a).compareTo(Integer.valueOf(b))).orElseThrow(NoSuchElementException::new);
		System.out.println(k3);
	}
}
