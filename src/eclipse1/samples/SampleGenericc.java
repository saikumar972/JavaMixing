package samples;

public class SampleGenericc<T> {
	T printable;

	public SampleGenericc(T printable) {
		super();
		this.printable = printable;
	}
	public void display() {
		System.out.println(printable);
	}
}
