package ir.maktab.repository;

import ir.maktab.model.Book;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Mahsa Alikhani m-58
 */
public class BookDao extends BaseDao{
    private final Connection connection;

    public BookDao() throws SQLException, ClassNotFoundException {
        connection = getConnection();
    }

    public Map<String, List<Book>> findBooksInfo() {
        return null;
    }
}
