package Graph;

public class Triangle extends Graph{
    public double l1,l2,l3;

    public Triangle() {
    }

    public Triangle(String type, double l1, double l2, double l3) {
        super(type);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double perimeter() {
        return l1+l2+l3;
    }
}
