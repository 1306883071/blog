package Worka;

public class Rectangle extends Shape{
    public double length,width;

    public Rectangle() {

    }
    public Rectangle(String color, String shapeInfo, double length, double width) {
        super(color, shapeInfo);
        this.length = length;
        this.width = width;
    }

    @Override
    public double computerArea() {
        return length*width;
    }
}
