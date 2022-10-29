package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestUserMap {
    public static void main(String[] args) {
        HashMap<Integer,User> hashMap = new HashMap<Integer,User>();
        Scanner scanner = new Scanner(System.in);
        String userName,password;
        for (int i=1;i<=3;i++){
            System.out.println("请输入用户的账和密码：");
            userName = scanner.nextLine();
            password = scanner.nextLine();
            hashMap.put(i,new User(userName,password));
        }
        display(hashMap);
    }

    private static void display(HashMap<Integer, User> hashMap) {
        Set<Integer> key = hashMap.keySet();
        Iterator<Integer> iterator = key.iterator();
        System.out.println("-------集合元素信息------");
        while (iterator.hasNext()){
            int i = iterator.next();
            User user = hashMap.get(i);
            System.out.println(user);
        }
    }
}
