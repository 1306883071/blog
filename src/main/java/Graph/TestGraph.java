package Graph;

import java.text.DecimalFormat;

public class TestGraph {
    public void displayPerimeter(Graph graph){
        DecimalFormat decimalFormat = new DecimalFormat(".0");
        System.out.println("圆形周长："+decimalFormat.format(graph.perimeter()));
    }
    public static void main(String[] args) {
        TestGraph testGraph = new TestGraph();
        testGraph.displayPerimeter(new Circle("圆",10));
        testGraph.displayPerimeter(new Rectangle("矩形",10,20));
        testGraph.displayPerimeter(new Triangle("三角形",10,20,30));

    }
}
