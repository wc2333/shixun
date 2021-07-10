import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newschina?useSSL=false", "root", "123456");
        System.out.println("连接成功");
    }
}
