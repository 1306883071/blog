package Thread;

public class ThreadPriority extends Thread {
    private String name; //线程名
    //构造方法
    public ThreadPriority(String name) {
        this.name = name;}
        public void run(){
            for (int i = 0; i < 3; i++) {
                System.out.println(this.name + "优先级:" + this.getPriority());
                try {
                    this.sleep(100); //让当前线程休眠 100毫秒
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority("线程1"); //创建线程
        t1.setPriority(Thread.MIN_PRIORITY); //设 置线程优先级
        t1.start();
//启动线程
        ThreadPriority t2 = new ThreadPriority("线程2"); //创建线程
        t2.setPriority(Thread.NORM_PRIORITY); //设 置线程优先级
        t2.start();
//启动线程
        ThreadPriority t3 = new ThreadPriority("线程3"); //创建线程
        t3.setPriority(Thread.MAX_PRIORITY); //设 置线程优先级
        t3.start();
//启动线程
    }
}