package Vehicle;

public class Car extends Vehicle{
    public Car() {
        super();
    }

    public Car(String typeCar) {
        super(typeCar);
    }

    @Override
    public int fee(int hour) {
        return 8*hour;
    }
}
