package ir.maktab.repository;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Mahsa Alikhani m-58
 */
public class BookDao extends BaseDao{
    private final Connection connection;

    public BookDao() throws SQLException, ClassNotFoundException {
        connection = getConnection();
    }

}
