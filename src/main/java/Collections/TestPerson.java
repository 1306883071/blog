package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class TestPerson {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Tom",19));
        linkedList.add(new Person("xxx",20));
        linkedList.add(new Person("T222om",16));
        linkedList.add(new Person("www",22));
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println("-------按年龄排序后的集合元素------");
        System.out.println(linkedList);
        Collections.reverse(linkedList);
        System.out.println("-------集合元素反转后的集合元素------");
        System.out.println(linkedList);
        Collections.shuffle(linkedList);
        System.out.println("-------集合元素扰乱后的集合元素------");
        System.out.println(linkedList);
    }
}
