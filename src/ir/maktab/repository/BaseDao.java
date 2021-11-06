package ir.maktab.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Mahsa Alikhani m-58
 */
public class BaseDao {
    private Connection connection;

    public BaseDao() {
        this.connection = connection;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_store", "root", "5103583");
        }
        return connection;
    }
}
