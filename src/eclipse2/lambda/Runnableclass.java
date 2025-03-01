package lambda;
class Runnablee implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Go run");
	}
	
}
public class Runnableclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new Thread(new Runnablee());
		//Runnable run= new Runnablee();
		thread.start();
		//using lambda
		Runnable runn= ()->System.out.println("Go GO run");
		Thread thread1=new Thread(runn);
		thread1.start();
		//or
		Thread thread2=new Thread(()->System.out.println("Go GO go run"));
		thread2.start();
	}

}
