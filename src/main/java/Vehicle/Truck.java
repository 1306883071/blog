package Vehicle;

public class Truck extends Vehicle{
    public Truck() {
        super();
    }

    public Truck(String typeCar) {
        super(typeCar);
    }

    @Override
    public int fee(int hour) {
        return 12*hour;
    }
}
