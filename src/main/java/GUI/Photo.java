package GUI;

import java.awt. *;
import javax.swing.* ;
public class Photo extends JFrame{
    public Photo() {
        setTitle("四季相册");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        add(jp1);
        add(jp2, BorderLayout.SOUTH); //将 按钮面板放置在边界布局的下
        jp1.setLayout(new CardLayout());
        ImageIcon ii = new ImageIcon("春.jpg");
        JLabel jl = new JLabel(ii);jp1.add(jl);
        ii = new ImageIcon("夏.jpg");
        jl = new JLabel(ii);jp1.add(jl);
        ii = new ImageIcon("秋.jpg");
        jl = new JLabel(ii);jp1.add(jl);
        ii = new ImageIcon("冬.jpg");
        jl = new JLabel(ii);jp1.add(jl);
        JButton jb = new JButton("第一张");jp2.add(jb);
        jb = new JButton("前一张");jp2.add(jb);
        jb = new JButton("后一张");jp2.add(jb);
        jb = new JButton("最后一张");jp2.add(jb);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Photo();
    }
}