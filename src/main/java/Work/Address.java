package Work;
public class Address {
    protected String postcode;
    protected String state;
    protected String province;
    protected String city;
    protected String street;

    public Address() {
    }

    public Address(String postcode, String state, String province, String city, String street) {
        this.postcode = postcode;
        this.state = state;
        this.province = province;
        this.city = city;
        this.street = street;
    }
    public String toString(){
        return "";
    }

}
