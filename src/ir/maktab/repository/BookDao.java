package ir.maktab.repository;

import ir.maktab.model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

    public List<Book> findBooksInfo() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from book_store");
        List<Book> books = new ArrayList<>();
        while (resultSet.next()){
            Book book = new Book();
            book.setId(resultSet.getInt("id"));
            book.setAuthorName(resultSet.getString("author_name"));
            book.setIsbn(resultSet.getString("isbn"));
            book.setBookTitle(resultSet.getString("book_title"));
            book.setPublishedYear(resultSet.getInt("published_year"));
            book.setPrice(resultSet.getInt("price"));
            book.setSoldNumber(resultSet.getInt("sold_number"));
            books.add(book);
        }
        return books;
    }
}
