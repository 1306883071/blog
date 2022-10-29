package Worka;

public class Test {
    public void judge(Circle circle){
        circle.displayInfo();
    }
    public void judge(Rectangle rectangle){
        rectangle.displayInfo();
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.judge(new Circle("红色","圆",10));
        test.judge(new Rectangle("蓝色","矩形",2,3));
    }
}
