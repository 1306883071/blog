package ThreadTest;

public class ThreadYield {
    public static void main(String[] args) {
        Yield t1 = new Yield("线程1");t1.start();
        Yield t2 = new Yield("线程2");t2.start();
    }
}
class Yield extends Thread{
    public Yield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            if (i==3){
                System.out.println(Thread.currentThread().getName()+"让步！");
                Thread.yield();
            }
        }
    }
}
