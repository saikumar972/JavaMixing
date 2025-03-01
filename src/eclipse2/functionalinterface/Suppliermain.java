package functionalinterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;
//supplier interface does not take any paramter but returns the value of the generic type
class Supplierimpl implements Supplier<String>{

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "sare";
	}
}
public class Suppliermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s=new Supplierimpl();
		System.out.println(s.get());
		//lambda date
		Supplier<LocalDateTime> s1=() -> LocalDateTime.now();
		System.out.println(s1.get());
	}

}
