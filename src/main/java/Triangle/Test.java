package Triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入三角形三边：");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        Triangle triangle = new Triangle(a,b,c);
        try {
            triangle.judgeTriangle();
        }catch (EdgeException e){
            e.printStackTrace();
        }
    }
}
