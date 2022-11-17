package supermarket;
import java.sql.*;
import java.util.ArrayList;
public class FruitDao {
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement preStmt = null;
    ResultSet rs = null;
    public ArrayList<Fruit> queryAll() {
        ArrayList<Fruit> list = new ArrayList<Fruit>();
        try{
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from fruit";
            rs = stmt.executeQuery(sql);
            Fruit fi;
            while( rs.next() ) {
                fi = new Fruit();
                fi.setNumber(rs.getString(1));
                fi.setName(rs.getString(2));
                fi.setPrice(rs.getDouble(3));
                fi.setUnit(rs.getString(4));
                list.add(fi);
            }
            JDBCUtils.release(rs, stmt, conn);
        }catch(Exception e) {
            e.printStackTrace();
        }
            return list;
        }
    public void addFriut(Fruit fi) {
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into fruit(number,fruitName,price,unit) values(?,?,?,?)";
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, fi.getNumber());
            preStmt.setString(2, fi.getName());
            preStmt.setString(3,fi.getPrice()+"");
            preStmt.setString(4, fi.getUnit());

            int count = preStmt.executeUpdate();
            if( count>0 ) {
                System.out.println("数据插入成功! ");
            }
            JDBCUtils.release(preStmt, conn);
        }catch(Exception e) {
            e.printStackTrace();


        }

    }
    public void delFruit(String delNumber) {
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "delete from fruit where number='" + delNumber + "'";
            int num = stmt.executeUpdate(sql);
            if (num > 0) {
                System.out.println("删除数据成功! ");
            }
            JDBCUtils.release(stmt, conn);
        } catch (Exception e) {
            e.printStackTrace();


        }
    }

}