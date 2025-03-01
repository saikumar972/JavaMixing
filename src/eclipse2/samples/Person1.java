package samples;

public class Person1 {
	private int id;
	private String name;
	private String random;
	public Person1(int id, String name, String random) {
		super();
		this.id = id;
		this.name = name;
		this.random = random;
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
	public String getRandom() {
		return random;
	}
	public void setRandom(String random) {
		this.random = random;
	}
	@Override
	public String toString() {
		return "Person1 [id=" + id + ", name=" + name + ", random=" + random + "]";
	}
	
}
