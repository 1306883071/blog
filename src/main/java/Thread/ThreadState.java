package Thread;

public class ThreadState extends Thread{
    public static void main(String[] args) {
        try {
            ThreadState threadState= new ThreadState();
            System.out.println("当前线程："+Thread.currentThread());
            System.out.println("线程状态："+threadState.getState());
            threadState.start();
            System.out.println("线程状态："+threadState.getState());
            threadState.join();
            System.out.println("线程状态："+threadState.getState());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
