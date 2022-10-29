package Work;

public class InternationalAddress extends Address{

    public InternationalAddress() {
    }

    public InternationalAddress(String postcode, String state, String province, String city, String street) {
        super(postcode, state, province, city, street);
    }

    @Override
    public String toString() {
        return street+"-"+city+"-"+province+"-"+state+"-"+postcode;
    }
}
