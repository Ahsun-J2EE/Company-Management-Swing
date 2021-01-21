package company.management.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static Connection instance;

    public static Connection getInstance() {
        try {
            instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "1234");
            System.out.println("::Connected::");
        } catch (SQLException ex) {

        }
        return instance;
    }
}
