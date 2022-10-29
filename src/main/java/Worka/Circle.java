package Worka;

public class Circle extends Shape{
    public double r;

    public Circle() {
    }

    public Circle(String color, String shapeInfo, double r) {
        super(color, shapeInfo);
        this.r = r;
    }


    public double computerArea() {
        return 3.14*r*r;
    }
}
