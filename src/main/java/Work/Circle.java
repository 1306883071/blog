package Work;

public class Circle {
    final double PI = 3.14;
    double CircleArea(double r){
        double area = PI * r * r;
        return area;
    }
    float CircleArea(float r){
        float area = (float) PI*r*r;
        return area;
    }
    float Circle(String r){
        float r1 = Float.parseFloat(r);
        float area = (float) PI*r1*r1;
        return area;
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("半径为10.0的圆面积为："+ circle.CircleArea(10.0));
        System.out.println("半径为10的圆面积为："+ circle.CircleArea(10));
        System.out.println("半径为10的圆面积为："+ circle.Circle("10"));
        System.out.println("半径为10的圆面积为："+ circle.CircleArea(10f));
    }

}
