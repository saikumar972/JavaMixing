package lambda;
interface Calculator{
	double calculation(int a, int b);
}
class Addition implements Calculator{
	@Override
	public double calculation(int a, int b) {
		return a+b;
	}
}
public class LambdawithParameters {

	public static void main(String[] args) {
		//normal flow
		Calculator addition=new Addition();
		System.out.println(addition.calculation(12, 13));
		//using lambda multiplication
		Calculator multiplication = (c,d)-> c*d;
		System.out.println(multiplication.calculation(12, 12));
	}

}
