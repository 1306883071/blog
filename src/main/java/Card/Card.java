package Card;

import java.util.ArrayList;
import java.util.Collections;

public class Card {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        StringBuffer lucky = new StringBuffer();
        Collections.shuffle(list);
        lucky.append(list.get(0));
        Collections.shuffle(list);
        lucky.append(list.get(0));
        Collections.shuffle(list);
        lucky.append(list.get(0));
        System.out.println("你的幸运数字是:"+lucky);

    }
}
