package Thread;

public class ThreadPriorityTest {
    public static void main(String[] args) {
        Thread min = new Thread(new Task(), "低优先级线程");
        Thread max = new Thread(new Task(), "高优先级线程");
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        min.start();
        max.start();
    }
}
    class Task implements Runnable {
        //实现接口中的抽象方法
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + "输出： " + i);
            }
        }
    }
