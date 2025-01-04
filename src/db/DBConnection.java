package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sudhir Kushwaha
 */
public class DBConnection {

    public static Connection getCon() {
        String url = "jdbc:mysql:///cws";
        String username = "root";
        String password = "1234";
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            return null;
        }
    }
}
