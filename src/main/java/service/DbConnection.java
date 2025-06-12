
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection() {
        String dbUrl = "jdbc:mysql://db:3306/students?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String username = "root";
        String password = "123456";

        try {
            return DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Veritabanına bağlanılamadı!");
        }
    }
}
