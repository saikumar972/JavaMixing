package methodref;
@FunctionalInterface
interface Printable{
	void print(String msg);
}
public class ObjectinstanceMethodName {
	public void display(String message) {
		message=message.toLowerCase();
		System.out.println(message);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectinstanceMethodName demo= new ObjectinstanceMethodName();
		//lambda expression
		Printable printable = (msg) -> demo.display(msg);
		printable.print("RAJVEER NANDA");
		//method ref
		Printable printable1 =demo::display;
		printable1.print("Sai NANDA");
	}
}
