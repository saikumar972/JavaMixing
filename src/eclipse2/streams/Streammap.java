package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Streammap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> userlist=new ArrayList<>();
		userlist.add(new User(1,"Rajveer","ok@","secret"));
		userlist.add(new User(2,"Nanda","ok1@","secret"));
		userlist.add(new User(3,"Sai","ok22@","secret"));
		//normally
		List<UserDto> dtolist=new ArrayList<>();
		UserDto dto=null;
		for(User u:userlist ) {
			dto=new UserDto(u.getId(),u.getName(),u.getMail());
			dtolist.add(dto);
		}
		System.out.println(dtolist);
		System.out.println("=================================");
		//using stream map
		List<UserDto> dtolist1=userlist.stream().map(new Function<User,UserDto>(){
			@Override
			public UserDto apply(User t) {
				// TODO Auto-generated method stub
				return new UserDto(t.getId(),t.getName(),t.getMail());
			}
		
		}).toList();
		System.out.println(dtolist1);
		System.out.println("===============================================");
		List<UserDto> dtolist2=userlist.stream().map((t) ->  new UserDto(t.getId(),t.getName(),t.getMail())
			
	 ).toList();
		System.out.println(dtolist2);
	}
}
class UserDto{
	private int id;
	private String name;
	private String mail;
	public UserDto(int id, String name, String mail) {
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
		return "userDto [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}
}
class User{
	private int id;
	private String name;
	private String mail;
	private String pwd;
	public User(int id, String name, String mail, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.pwd = pwd;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail + ", pwd=" + pwd + "]";
	}
}