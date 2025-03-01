package optionalclasses;

import java.util.Optional;

public class BasicOptional {

	public static void main(String[] args) {
		// empty, of, ofnullable
		Optional<Object> opt=Optional.empty();
		System.out.println(opt);
		System.out.println("=========");
		String k="rajveer";
		String k1="";
		String k2=null;
		//returns nullpointer exception if it has null
		Optional<String> koptional=Optional.of(k1);
		if(koptional.isPresent()) {
			System.out.println(koptional.get());
			System.out.println("value of of");
		}
		else {
			System.out.println("Null");
		}
		//ofnullable returns empty if there is no value instead of null exception
		Optional<String> koptional1=Optional.ofNullable(k1);
		System.out.println(koptional1);
		if(koptional.isPresent()) {
			//get returns no such value exeption if there is no value 
			System.out.println(koptional1.get());
			System.out.println("value of nullable");
		}
		else {
			System.out.println("Null");
		}
		System.out.println("===");
		//or Else
		Optional<String> email=Optional.ofNullable(k);
		String defualtt=email.orElse("Sareem led");
		System.out.println(defualtt);
		//orElseGet() method
		Optional<String> emaill=Optional.ofNullable(k2);
		String ok=emaill.orElseGet(()-> "default");
		System.out.println(ok);
		//orElseThrow
		Optional<String> emaill1=Optional.ofNullable(k2);
		//String ok1=emaill1.orElseThrow(()-> new IllegalArgumentException("email nt exist"));
		//System.out.println(ok1);
		//ifPresent
		Optional<String> present=Optional.of(k1);
		Optional<String> presentd=Optional.empty();
		present.ifPresent((s)-> System.out.println("nt ok"));
		presentd.ifPresent((s)-> System.out.println("no print ok"));
		//filter method
		//norma thing
		String variable=" abcd ";
		if(variable!=null && variable.contains("abc")) {
			System.out.println(variable);
		}
		else {
			System.out.println("no");
		}
		//using optional
		Optional<String> vary=Optional.of(variable);
		vary.filter((r) -> r.contains("ab"))
			.ifPresent((rv)->System.out.println(rv));
		vary.filter((stringg)->stringg.contains("k")).map((rr)->rr.trim()).ifPresent((rrr)->System.out.println(rrr));
		vary.filter((stringg)->stringg.contains("a")).map(String::trim).ifPresent((rrr)->System.out.println(rrr));
	}
}
