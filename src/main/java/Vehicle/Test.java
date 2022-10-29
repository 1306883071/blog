package Vehicle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle;
        System.out.println("输入停车小时，不足1小时按1小时算：");
        int hour = scanner.nextInt();
        vehicle = new Bus("客车");
        System.out.println(vehicle.typeCar+":"+vehicle.fee(hour)+"元");
        vehicle = new Truck("货车");
        System.out.println(vehicle.typeCar+":"+vehicle.fee(hour)+"元");
        vehicle = new Car("轿车");
        System.out.println(vehicle.typeCar+":"+vehicle.fee(hour)+"元");

    }
}
