package String;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String str = scanner.nextLine();
        int cNum = 0,dNum = 0, otherNum = 0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch>='a'&& ch<='z') || (ch>='A' && ch<= 'Z')){
                cNum++;
            } else if (ch>='0'&&ch<='9') {
                dNum++;
            }else {
                otherNum++;
            }
        }
        System.out.println("字母个数："+cNum);
        System.out.println("数字个数："+dNum);
        System.out.println("其他个数："+otherNum);
    }
}
