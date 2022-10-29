package PCl;

public class ShowCard implements PCI{
    @Override
    public void start() {
        System.out.println("显卡启动");
    }

    @Override
    public void stop() {
        System.out.println("显卡关闭");
    }
}
