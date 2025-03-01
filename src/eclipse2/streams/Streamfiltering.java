package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Streamfiltering {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list=getproducts();
		list.forEach((list1)->{
			if(list1.getPrice()>12000) {
				System.out.println(list1);
			}
		});
		//using filter
		List<Product> filterlist=getproducts().stream().filter((list2)-> list2.getPrice()>12000).toList();
		System.out.println(filterlist);
		System.out.println("====================================================");
		//ascending order
		List<Product> filterlistt=getproducts().stream().sorted((o1,o2)-> (int)(o1.getPrice()-o2.getPrice())).toList();
		filterlistt.forEach(System.out::println);
		System.out.println("===============");
		List<Product> filterlisttt=getproducts().stream().sorted(Comparator.comparingDouble(Product::getPrice)).toList();
		filterlisttt.forEach(System.out::println);
	}
	private static List<Product> getproducts(){
		List<Product> list=new ArrayList<>();
		list.add(new Product(1,"Rajveer",12000));
		list.add(new Product(2,"Nanda",13000));
		list.add(new Product(3,"Sai",124000));
		return list;
	}
}
class Product{
	private int id;
	private String name;
	private double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}