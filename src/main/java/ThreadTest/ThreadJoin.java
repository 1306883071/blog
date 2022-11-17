package ThreadTest;

public class ThreadJoin {
    public static void main(String[] args) {
        Thread thread = new Thread(new Emergence(),"线程1");
        thread.start();
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                if (i==2){
                    thread.join();
                }
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
class Emergence implements Runnable{
    @Override
    public void run() {
        for (int i=5;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(200);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
