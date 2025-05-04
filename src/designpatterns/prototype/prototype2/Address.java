package designpatterns.prototype.prototype2;

public class Address implements Cloneable{
    private String district;
    private String state;

    public Address(String district, String state) {
        this.district = district;
        this.state = state;
    }

    @Override
    public Address clone()  {
        try {
            Address clonedAddress= (Address) super.clone();
            clonedAddress.setDistrict(null);
            return clonedAddress;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("clone not supporting gulu"+e);
        }
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "district='" + district + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
