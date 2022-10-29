package Graph;

public class Rectangle extends Graph{
    public double length,width;
    public Rectangle(String type, double length, double width) {
        super(type);
        this.length = length;
        this.width = width;
    }
    public Rectangle() {}
    @Override
    public double perimeter() {
        return 2*(length+width);
    }
}
