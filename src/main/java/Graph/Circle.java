package Graph;

public class Circle extends Graph{
    public double r;

    public Circle(String type, double r) {
        super(type);
        this.r = r;
    }

    public Circle() {
    }

    @Override
    public double perimeter() {
        return 2*3.14*r;
    }
}
