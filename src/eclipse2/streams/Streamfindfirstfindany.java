package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streamfindfirstfindany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findfirst and findany
		List<String> list=Arrays.asList("some","are","there");
		Optional<String> firstt=list.stream().findFirst();
		if(firstt.isPresent()) {
			System.out.println(firstt.get());
		}
		else {
			System.out.println("no");
		}
		Optional<String> findany=list.stream().findAny();
		if(findany.isPresent()) {
			System.out.println(firstt.get());
		}
		else {
			System.out.println("no");
		}
	}

}
