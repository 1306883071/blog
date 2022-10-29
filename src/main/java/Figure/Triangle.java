package Figure;

public class Triangle extends Figure{
    public double hemline,height;

    public Triangle(double hemline, double height) {
        this.hemline = hemline;
        this.height = height;
    }

    public Triangle() {
    }

    @Override
    public double area() {
        return hemline*height;
    }
}
