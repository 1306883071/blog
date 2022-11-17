package ThreadTest;

public class ThreadSleep {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadTask(), "线程1");
        t.start();
        try{
            for (int i=1; i <= 5; i++){
                if (i == 4){
                    Thread.sleep(1000);}
                else{
                    Thread.sleep(500);
                }
                System.out.println(Thread.currentThread().getName() + " 输出: " + i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class ThreadTask implements Runnable {
    //实现接口中的抽象方法
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                if (i == 2) {
                    Thread.sleep(1000);
//当前线程休眠1秒
                } else {
                    Thread.sleep(500);
//当前线程休眠500毫秒
                    System.out.println(Thread.currentThread().getName() + "输出: " + i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
