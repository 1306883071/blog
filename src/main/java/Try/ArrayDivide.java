package Try;

import java.util.Scanner;

public class ArrayDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1[],d2[];
        int len1,len2;
        System.out.println("输入两个数组长度：");
        len1 = scanner.nextInt();
        len2 = scanner.nextInt();
        d1 = new int[len1];
        d2 = new int[len2];
        System.out.println("输入第一个的数组中的"+d1.length+"个整数");
        for (int i=0; i<d1.length;i++){
            d1[i] = scanner.nextInt();
        }
        System.out.println("输入第二个的数组中的"+d2.length+"个整数");
        for (int i=0; i<d2.length;i++){
            d2[i] = scanner.nextInt();
        }
        for (int i=0;i<d1.length;i++){
            try{
                System.out.println(d1[i]+"/"+d2[i]+"="+(d1[i]/d2[i]));
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }catch (Exception e){
                System.out.println("程序出现异常！");
            }
        }

    }
}
