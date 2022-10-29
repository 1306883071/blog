package Vehicle;

public class Bus extends Vehicle{
    public Bus() {
        super();
    }
    public Bus(String typeCar) {
        super(typeCar);
    }

    @Override
    public int fee(int hour) {
        return 15*hour;
    }

}
