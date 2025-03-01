package eclipse2.mapvsflatmap;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private String mail;
	private List<String> phonemumber;
	public Student(int id, String name, String mail, List<String> phonemumber) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.phonemumber = phonemumber;
	}
	
	public List<String> getPhonemumber() {
		return phonemumber;
	}

	public void setPhonemumber(List<String> phonemumber) {
		this.phonemumber = phonemumber;
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
