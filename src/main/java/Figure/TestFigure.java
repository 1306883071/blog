package Figure;

public class TestFigure {
    public static void main(String[] args) {
        Figure figure;
        figure = new Square(10);
        System.out.println("正方形的面积为："+figure.area());
        figure = new Triangle(10,2);
        System.out.println("长方形的面积为："+figure.area());
    }
}
