package samples;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleGenericc<Integer> ss= new SampleGenericc<>(23);
		ss.display();
		
		SampleGenericc<String> ss1= new SampleGenericc<>("edaina will take");
		ss1.display();
		//Animals
		
		GenericAnimal<Animal> gen=new GenericAnimal<>(new Cat());
		gen.display();
		
		GenericAnimal<Cat> gen1=new GenericAnimal<>(new Cat());
		gen1.display();
		
		//generic method
		display(1);
		display("saree");
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(21);
		display1(list);
		
		List<String> list1=new ArrayList<String>();
		list1.add("sai");
		display1(list1);
	}
	private static <ok> void display(ok tik) {
		System.out.println(tik);
	}
	
	private static  void display1(List<?> tik) {
		System.out.println(tik);
	}
}
