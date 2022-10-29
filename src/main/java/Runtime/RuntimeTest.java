package Runtime;

public class RuntimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("处理器的个数："+runtime.availableProcessors());
        System.out.println("空闲内寸量："+runtime.freeMemory()/1024/1024);
        System.out.println("最大可用内存量："+runtime.maxMemory()/1024/1024);
        try {
            Process process = runtime.exec("mspaint.exe");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
