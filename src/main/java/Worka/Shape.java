package Worka;

public class Shape {
     public String color,shapeInfo;

    public Shape() {
    }

    public Shape(String color, String shapeInfo) {
        this.color = color;
        this.shapeInfo = shapeInfo;
    }
    public double computerArea(){
        return 0;
    }
    public void displayInfo(){
        System.out.println("形状："+shapeInfo);
        System.out.println("颜色："+color);
        System.out.println("面积："+computerArea());
    }
}
