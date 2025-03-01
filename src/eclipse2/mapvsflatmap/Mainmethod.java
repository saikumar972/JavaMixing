package eclipse2.mapvsflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class Mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentslist=StudentList.studentslist();
		List<String> mails= studentslist.stream().map((ok) -> ok.getMail()).collect(Collectors.toList());
		System.out.println(mails);
		List<List<String>> phone= studentslist.stream().map((ok) -> ok.getPhonemumber()).collect(Collectors.toList());
		System.out.println(phone);
		
		List<String> phonenumbers= studentslist.stream().flatMap((ok) -> ok.getPhonemumber().stream()).collect(Collectors.toList());
		System.out.println(phonenumbers);
	}

}
