package System;
import java.util.Scanner;
public class TimeTest {
    public static void hanoi(String a,String b,String c,int n){
        if (n==1){
            System.out.println(a+"-->"+c);
        }else {
            hanoi(a,c,b,n-1);
            System.out.println(a+"-->"+c);
            hanoi(b,a,c,n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入盘子数：");
        int plate = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        hanoi("A","B","C",plate);
        long endTime = System.currentTimeMillis();
        System.out.println("移动"+plate+"个盘子的时间是："+(endTime-startTime)+"毫秒");

    }
}
