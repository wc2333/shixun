package hr.Dao;

import hr.Entity.User;

import java.sql.*;

public class UserDao {
     /*  public static void main(String[] args) throws Exception {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newschina", "root", "root");
        System.out.println("连接成功");
    }*/

    public User getUser(int uid) throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/newschina?useSSL=false&characterEncoding=utf-8";
        Connection connection = DriverManager.getConnection(url, "root", "123456");
        System.out.println("连接成功");
        PreparedStatement pstmt = connection.prepareStatement("select * from user where uid = ?");
        pstmt.setInt(1, uid);
        ResultSet rs = pstmt.executeQuery();
        User user = null;
        if (rs.next()) {
            int id = rs.getInt("uid");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String gender = rs.getString("gender");
            String phone = rs.getString("phone");
            user = new User(id, username, password, gender, phone);
        }
        //关闭连接
        rs.close();
        pstmt.close();
        connection.close();
        return user;
    }

    ;
}
