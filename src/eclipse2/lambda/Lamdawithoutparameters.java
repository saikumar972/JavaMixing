package lambda;
interface Shape{
	void shape();
}
class Rectangle implements Shape{
	@Override
	public void shape() {
		System.out.println("Rectangle in shapes");
	}
}
class Circle implements Shape{
	@Override
	public void shape() {
		System.out.println("Circle in shapes");
	}
}
public class Lamdawithoutparameters {
	public static void main(String[] args) {
		//normal code
		Shape rectangle=new Rectangle();
		rectangle.shape();
		//with the lambda
		Shape cone=()-> System.out.println("Cone in shape");
		cone.shape();
	}

}
