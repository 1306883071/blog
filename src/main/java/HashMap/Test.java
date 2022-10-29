package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Champion champion = new Champion();
        HashMap<String,WorldCup> map = champion.createChampion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        String year = scanner.next();
        if (map.containsKey(year)){
            System.out.println(year+"年世界杯是："+map.get(year).getChampion());
        }else {
            System.out.println("该年份没有举办世界杯！");
        }
    }
}
