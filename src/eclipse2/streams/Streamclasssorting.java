package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streamclasssorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//normal sorting by salary
		List<Productt> mainlist=getProducts();
		List<Productt> sortBySalary=mainlist.stream().sorted(new Comparator<Productt>(){
			@Override
			public int compare(Productt o1, Productt o2) {
				// TODO Auto-generated method stub
				return (int)(o1.getSalary()-o2.getSalary());
			}
		}).toList();
		sortBySalary.forEach(System.out::println);
		System.out.println("===================================");
		//using lambda
		List<Productt> sortBySalary1=mainlist.stream().sorted(( o1,o2)-> (int)(o1.getSalary()-o2.getSalary())).toList();
		sortBySalary1.forEach(System.out::println);
		System.out.println("=====================================");
		//using comparator method
		List<Productt> sortBySalary2=mainlist.stream().sorted(Comparator.comparingDouble(Productt::getSalary)).toList();
		sortBySalary2.forEach(System.out::println);
		//using comparator method reverse
		List<Productt> sortBySalary3=mainlist.stream().sorted(Comparator.comparingDouble(Productt::getSalary).reversed()).collect(Collectors.toList());
		sortBySalary3.forEach(System.out::println);
		System.out.println("=====================================");
		//sort name
		List<Productt> sortByName=mainlist.stream().sorted(Comparator.comparing(Productt::getName)).collect(Collectors.toList());
		sortByName.forEach(System.out::println);
		System.out.println("=====================================");
		//experiment
		List<Productt> sortByNamefilter=mainlist.stream().filter((k) ->k.getSalary()>12000).sorted(Comparator.comparing(Productt::getName)).collect(Collectors.toList());
		sortByNamefilter.forEach(System.out::println);
	}
private static List<Productt> getProducts() {
	List<Productt> list=new ArrayList<>();
	list.add(new Productt(1,"dell",15000));
	list.add(new Productt(2,"mac",12000));
	list.add(new Productt(3,"hp",13000));
	list.add(new Productt(4,"honor",14000));
	return list;
}
}
class Productt{
	private int id;
	private String name;
	private double salary;
	public Productt(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}