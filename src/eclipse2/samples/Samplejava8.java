package samples;
interface Shape{
	void display();
}
interface Calculator{
	double operation(int a, int b);
}

public class Samplejava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape Rectangle =()->System.out.println("ok");
		Rectangle.display();
		
		Calculator Addition=(a,b)-> a+b;
		System.out.println(Addition.operation(12, 12));
		
		
		//Thread threadd=new Thread(new Threadss());
		//threadd.start();
		
		
		Shape Circle=new Shape (){
			public void display() {
				System.out.println("something in circle");
			}
		};
		Circle.display();
	}
	}

