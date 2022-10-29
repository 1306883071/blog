package Teacher;

import java.util.Scanner;

public class TestTeacher {
    public static void main(String[] args) {
        int courseNum;
        Teacher teacher;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入课时：");
        courseNum = scanner.nextInt();
        teacher = new Instructor();
        System.out.println("讲师的课酬是："+teacher.pay(courseNum));
        teacher = new Assistant();
        System.out.println("助教的课酬是："+teacher.pay(courseNum));
        teacher = new Professor();
        System.out.println("教授的课酬是："+teacher.pay(courseNum));
    }
}
