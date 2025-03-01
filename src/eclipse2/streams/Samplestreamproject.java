package streams;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Samplestreamproject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Student> studentList=StudentList.studentList();
		String mail="nada1@gmail.com";
		Student  k=studentList.stream()
				.filter((s) -> s.getMail().equals(mail))
				.findAny()
				.orElseThrow(() ->new Exception("no such mail exists"));
		System.out.println(k);
	}

}
class Student{
	private int id;
	private String name;
	private String mail;
	
	public Student(int id, String name, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}
}

class StudentList{
	public static List<Student> studentList() {
		return  Stream.of(new Student(1,"Rajveer","Rajveer@gmail.com"),
				  new Student(2,"Sanju","Sanju@gmail.com"),
				  new Student(3,"nandu","nada@gmail.com"))
		.toList();
	}
}