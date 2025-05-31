package sql;
import java.sql.*;
public class example01 {
    public static void main(String[] args) throws SQLException{
        Connection conn = null;
        Statement stmt = null;
        try {
            //1.加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.通过DriverManager 获取数据库连接
            String url = "jdbc:mysql://localhost:3306/jdbc_demo";
            String username = "root";
            String password = "root";
            conn = DriverManager.getConnection(url,username,password);
            //3.通过Connection对象获取Statement对象
            stmt = conn.createStatement();
            //4.使用Statement执行SQL语句
            String sql = "SELECT * FROM tb_space";
            rs = stmt.executeQuery(sql);
            //5.操作ResultSet结果集
            System.out.println();
        } catch () {

        }
    }

}
