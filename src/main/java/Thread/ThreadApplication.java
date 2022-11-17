package Thread;

import javax.security.auth.Subject;

public class ThreadApplication {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("当前线程是："+thread);
        thread.setName("MYjavaThread");
        System.out.println("当前线程名是："+thread);
        try {
            for (int i= 0;i<3;i++){
                System.out.println(i);
                Thread.sleep(1500);
            }
        }catch (InterruptedException e){
            System.out.println("主线程被切断");
        }
    }
}
