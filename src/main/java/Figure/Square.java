package Figure;

public class Square extends Figure{
    public double line;

    public Square(double line) {
        this.line = line;
    }

    public Square() {
    }

    @Override
    public double area() {
        return line*line;
    }
}
