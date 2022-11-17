package Thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println("MYRUn run");
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();
        while (true){
            System.out.println("main ");
        }
    }
}
