package supermarket;
import java.sql.*;
public class JDBCUtils {

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/supermarket";
        String name = "root";
        String password = "123456789";
        Connection conn = DriverManager.getConnection(url, name, password);
        return conn;
    }
    public static void release(Statement stmt, Connection conn) throws Exception {
        if (stmt != null) {
            stmt.close();
            stmt = null;
        }
            if (conn != null) {
                conn.close();
                conn = null;

            }

        }
    public static void release(ResultSet rs, Statement stmt, Connection conn) throws Exception {
        if (rs != null) {
            rs.close();
            rs = null;
        }
            release(stmt, conn);
        }

    }