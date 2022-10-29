import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess = random.nextInt(10);
        System.out.println("输入0-9的数");
        int num =scanner.nextInt();
        while (num != guess){
            if (num<guess){
                System.out.println("太小了，请重猜");
            }else {
                System.out.println("太大了，请重猜");
            }
            System.out.println("猜猜0-9的数");
            num = scanner.nextInt();
        }
        System.out.println("恭喜你猜对了");
    }
}
