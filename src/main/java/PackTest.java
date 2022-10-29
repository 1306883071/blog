import java.util.Scanner;

public class PackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码：");
        String keyword = scanner.next();
        if (keyword.equals("123")){
            System.out.println("输入密码正确");
        }else {
            System.out.println("输入密码错误");
        }
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        System.out.println(num+"对应的二进制"+Integer.toBinaryString(num));
        System.out.println(num+"对应的八进制"+Integer.toOctalString(num));
        System.out.println(num+"对应的十六进制"+Integer.toHexString(num));
    }
}
