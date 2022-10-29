package PCl;

public class NetCard implements PCI{
    @Override
    public void start() {
        System.out.println("网卡启动");
    }

    @Override
    public void stop() {
        System.out.println("网卡关闭");
    }
}
