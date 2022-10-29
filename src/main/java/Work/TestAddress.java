package Work;

public class TestAddress {
    public static void main(String[] args) {
        DomesticAddress domesticAddress = new DomesticAddress("410000","中国","湖北省","荆门市","东宝区");
        System.out.println(domesticAddress.toString());
        InternationalAddress internationalAddress = new InternationalAddress("200010","xxs","www","ssss","tttt");
        System.out.println(internationalAddress.toString());
    }
}
