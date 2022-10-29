package Teacherq;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTeacher {
    public static void main(String[] args) {
        TreeSet<Teacher> set = new TreeSet<Teacher>();
        set.add(new Teacher("03027","杨辉",7500));
        set.add(new Teacher("03027","张艳",8000));
        set.add(new Teacher("03022","刘亦鹏",4800));
        set.add(new Teacher("03025","彭金玲",5800));
        System.out.println(set);
        Iterator<Teacher> iterator = set.iterator();
        Teacher teacher;
        while (iterator.hasNext()){
            teacher = iterator.next();
            if (teacher.getNo().equals("03022")){
                iterator.remove();
            }
        }
        System.out.println("删除教师后的集合元素：");
        System.out.println(set);

    }
}
