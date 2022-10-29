package Try;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        int a=0,b=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        try{
            a = scanner.nextInt();
            b = scanner.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        try{
            System.out.println(a+"/"+b+"="+(a/b));
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
