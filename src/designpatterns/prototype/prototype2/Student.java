package designpatterns.prototype.prototype2;

public class Student implements Cloneable{
    private int id;
    private String name;
    private Address address;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public Student clone()  {
        try {
            Student clonedStudent=(Student) super.clone();
            //clonedStudent.setAddress(this.address.clone());
            clonedStudent.address = this.address.clone();
            return clonedStudent;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("clone not supporting gulu"+e);
        }
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
