package supermarket;
import java.awt.event.* ;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;

public class FruitInterface extends JDialog implements ActionListener {

    JTable jt = new JTable();
    FruitDao fruitDao = new FruitDao();

    JTextField addNumber = new JTextField(6);
    JTextField addName = new JTextField(6);
    JTextField addPrice = new JTextField(6);
    JTextField addUnit = new JTextField(6);

    JTextField updateNumber = new JTextField(6);
    JTextField updateName = new JTextField(6);
    JTextField updatePrice = new JTextField(6);
    JTextField updateUnit = new JTextField(6);

    JTextField delNumber = new JTextField(6);

    JButton addBt = new JButton("添加水果");
    JButton updateBt = new JButton("修改水果");
    JButton delBt = new JButton("删除水果");

    public FruitInterface() {
        setTitle("超市货物管理");
        setSize(600, 400);
        setResizable(false);
        setLayout(null);

        JLabel jl = new JLabel("水果列表");
        jl.setBounds(265, 20, 70, 25);
        add(jl);

        jt.getTableHeader().setReorderingAllowed(false);
        jt.getTableHeader().setResizingAllowed(false);
        jt.setEnabled(false);
        JScrollPane jsp = new JScrollPane(jt);
        jsp.setBounds(50, 50, 500, 200);
        add(jsp);

        jl = new JLabel("水果编号");
        jl.setBounds(50, 250, 70, 25);
        add(jl);
        jl = new JLabel("水果名称");
        jl.setBounds(150, 250, 70, 25);
        add(jl);
        jl = new JLabel("水果单价");
        jl.setBounds(250, 250, 70, 25);
        add(jl);
        jl = new JLabel("计价单位");
        jl.setBounds(350, 250, 70, 25);
        add(jl);

        addNumber.setBounds(50, 280, 80, 25);
        add(addNumber);
        addName.setBounds(150, 280, 80, 25);
        add(addName);
        addPrice.setBounds(250, 280, 80, 25);
        add(addPrice);
        addUnit.setBounds(350, 280, 80, 25);
        add(addUnit);
        addBt.setBounds(460, 280, 90, 25);
        add(addBt);


        updateNumber.setBounds(50, 310, 80, 25);
        add(updateNumber);
        updateName.setBounds(150, 310, 80, 25);
        add(updateName);
        updatePrice.setBounds(250, 310, 80, 25);
        add(updatePrice);
        updateUnit.setBounds(350, 310, 80, 25);
        add(updateUnit);
        updateBt.setBounds(460, 310, 90, 25);
        add(updateBt);


        delNumber.setBounds(50, 340, 80, 25);
        add(delNumber);
        delBt.setBounds(460, 340, 90, 25);
        add(delBt);

        addBt.addActionListener(this);
        updateBt.addActionListener(this);
        delBt.addActionListener(this);

    }

    public void queryFruit() {

        ArrayList<Fruit> list = fruitDao.queryAll();

        String[][] tBody = new String[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            Fruit fruitltem = list.get(i);
            tBody[i][0] = fruitltem.getNumber();
            tBody[i][1] = fruitltem.getName();
            tBody[i][2] = fruitltem.getPrice() + "";
            tBody[i][3] = fruitltem.getUnit();

        }

        String[] tHead = new String[]{"水果编号", "水果名称", "水果单价(/元)", "水果单位"};
        TableModel data = new DefaultTableModel(tBody, tHead);
        jt.setModel(data);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBt) {
            String number = addNumber.getText();
            String name = addName.getText();
            String price = addPrice.getText();
            String unit = addUnit.getText();
            Fruit fi = new Fruit(number, name, Double.valueOf(price), unit);

            boolean result = false;
            ArrayList<Fruit> list = fruitDao.queryAll();
            for (int i = 0; i < list.size(); i++) {
                if (number.equals(list.get(i).getNumber())) {
                    result = true;
                    break;

                }
            }

            if (!result) {
                fruitDao.addFriut(fi);
                queryFruit();
            } else {
                JOptionPane.showConfirmDialog(this,"水果编号不能重复! ");
            }
            addNumber.setText("");
            addName.setText("");
            addPrice.setText("");
            addUnit.setText("");
        }

        if (e.getSource() == updateBt) {
            String number = updateNumber.getText();
            String name = updateName.getText();
            String price = updatePrice.getText();
            String unit = updateUnit.getText();
            boolean result = false;
            ArrayList<Fruit> list = fruitDao.queryAll();


            for (int i = 0; i < list.size(); i++) {
                if (number.equals(list.get(i).getNumber())) {
                    fruitDao.delFruit(number);
                    Fruit fi = new Fruit(number, name, Double.valueOf(price), unit);
                    fruitDao.addFriut(fi);
                    queryFruit();
                    result = true;
                    break;
                }
            }
            if (!result) {
                JOptionPane.showConfirmDialog(this, "该水果不存在! ");
            }
            updateNumber.setText("");
            updateName.setText("");
            updatePrice.setText("");
            updateUnit.setText("");
        }

        if (e.getSource() == delBt) {
            String number = delNumber.getText();
            ArrayList<Fruit> list = fruitDao.queryAll();
            boolean result = false;
            for (int i = 0; i < list.size(); i++) {
                if (number.equals(list.get(i).getNumber())) {
                    fruitDao.delFruit(number);
                    queryFruit();
                    result = true;
                    break;
                }
            }


            if( !result) { //删除不成功弹 窗错误提示
                JOptionPane.showConfirmDialog(this, "该水果不存在! ");
            }
                delNumber.setText("");
        }
    }
}