package lk.codepro.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_connection {
        private static db_connection DBconnection;
        final Connection connection;

    private db_connection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system", "root", "1234@root1234");

        }

    public static db_connection getInstance () throws ClassNotFoundException, SQLException {
            if(DBconnection == null){
                DBconnection = new db_connection();
            }
            return DBconnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
