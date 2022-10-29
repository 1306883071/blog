package StringBuffer;

import java.util.Scanner;

public class StringSplit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        StringBuffer original = new StringBuffer(scanner.nextLine());
        StringBuffer result = new StringBuffer();
        int count = 0;
        for (int i = 0;i<original.length();i++){
            result.append(original.charAt(i));
            count++;
            if (count % 3 == 0){
                result.append(",");
            }
        }
        System.out.println(result);
    }
}
