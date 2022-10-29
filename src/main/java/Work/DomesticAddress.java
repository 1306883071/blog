package Work;

public class DomesticAddress extends Address{
    public DomesticAddress() {
    }

    public DomesticAddress(String postcode, String state, String province, String city, String street) {
        super(postcode, state, province, city, street);
    }

    @Override
    public String toString() {
        return postcode+"-"+state+"-"+province+"-"+city+"-"+street;
    }
}
