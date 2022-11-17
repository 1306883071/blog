package GUI;
import javax.swing.*;
public class Chat extends JFrame{
    public Chat() {
        setTitle("聊天系统");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea jta = new JTextArea(12, 30); //创建 一个文本域
        jta.setEditable(false);
//文本域设置为不可编辑
//创建滚动面板，显示组件为文本域，水平、垂直滚动条在需要的时候显示
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp); //将滚动面 板放置在JFrame窗口的中间位置
        JPanel jp = new JPanel(); //定 义面板
        add(jp, "South");
//将 面板放置在JFrame窗口的底部
        JLabel jl = new JLabel("请输入聊天信息"); //创建标签
        jp.add(jl);
//将标签组件添加到面板中
        JTextField jtf = new JTextField(20);
        jp.add(jtf);
//将文本域组件添加到面板中
        JButton jb = new JButton("发送");
        jp.add(jb);
//将按钮组件添加到面板中
        setVisible(true);
    }

    public static void main(String[] args) {
        new Chat();
    }
}
