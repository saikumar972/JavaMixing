package samples;

import java.util.Optional;

public class Optionall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail=null;
		Optional<String> ok= Optional.ofNullable(mail);
		if(ok.isPresent()) {
			System.out.println(ok.get());
		}
		else{
			System.out.println("em ledu");
		}
		System.out.println(ok.orElse("ede pakka"));
		
		//filter
		Optional<String> filterr= Optional.of("something");
		filterr.filter((k) -> k.contains("some")).ifPresent((k)-> System.out.println("success ade "));
		
		
		Optional<String> mapp=Optional.of("okok  ");
		mapp.filter((k)-> k.contains("o")).map((k)-> k.length()).ifPresent((k)-> System.out.println(k));
		
		
		//map in class
		Optional<Person> personn= Optional.of(new Person(1,"sare"));
		Optional<Person1> person1= personn.map((person) -> new Person1(person.getId(),person.getName(),"something"));
		System.out.println(person1.get());		
	}
	
}
