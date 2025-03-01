package eclipse1.arrayListt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> personList=method();
		System.out.println(personList);
		Collections.sort(personList, (o1,o2)->{
			return o1.getName().compareTo(o2.getName());
		});
		personList.forEach(k->System.out.println(k));
		System.out.println("------------------------");
		//using lambda
		Collections.sort(personList, (o1,o2)->{
			return o1.getId()-o2.getId();
		});
		personList.forEach(k->System.out.println(k));
		System.out.println("------------------------");
		
		//Collections.sort(personList, new SalarySort());
		
		Collections.sort(personList, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return (int)(o1.getSalary()-o2.getSalary());
			}
		});
		System.out.println(personList);
	}
	public  static List<Person> method(){
		return Stream.of(new Person(1,"Rajveer",1000.28),
				new Person(3,"Saikumar",1000.24),
				new Person(2,"Nanda",3000),
				new Person(4,"sare",4000)).collect(Collectors.toList());
	}
	class SalarySort implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			//return  (int)(o1.getSalary()-o2.getSalary());
			return Double.compare(o1.getSalary(),o2.getSalary());
		}
		
	}
}
