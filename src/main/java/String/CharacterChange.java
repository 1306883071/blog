package String;

import java.util.Scanner;

public class CharacterChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String str = scanner.nextLine();
        char ch[] = new char[str.length()];
        for (int i= 0;i<str.length();i++){
            char temp = str.charAt(i);
            if (temp >= 97 && temp <= 122){
                ch[i] = (char)(temp - 32);
            } else if (temp >= 65 && temp <= 90) {
                ch[i] = (char)(temp + 32);
            }else {
                ch[i]=temp;
            }
        }
        System.out.println("转换后结果："+ new String(ch));
    }
}
