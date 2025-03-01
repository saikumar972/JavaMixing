package samples;

public class GenericAnimal <T extends Animal>{
	T printable;
	public GenericAnimal(T printable) {
		super();
		this.printable = printable;
	}
	public void display() {
		printable.animal();
		System.out.println(printable);
	}
}
