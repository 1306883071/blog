package ThreadTest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSynchronization {
    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(101);
        new Thread(new Task1(integer), "窗口1").start();
        new Thread(new Task1(integer), "窗口2").start();
        new Thread(new Task1(integer), "窗口3").start();
        new Thread(new Task1(integer), "窗口4").start();
    }

    public static class Task1 implements Runnable {
        private final AtomicInteger integer;
        public Task1(AtomicInteger integer) {
            this.integer = integer;
        }
        @Override
        public void run() {
            while (Boolean.TRUE) {
                if (integer.get() <= 0) {
                    System.out.println("票已经卖完!");
                    break;
                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName() + "出售:" + integer.decrementAndGet());

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
