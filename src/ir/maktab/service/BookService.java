package ir.maktab.service;

import ir.maktab.model.Book;
import ir.maktab.repository.BookDao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Mahsa Alikhani m-58
 */
public class BookService {
    private final BookDao bookDao;

    public BookService() throws SQLException, ClassNotFoundException {
        bookDao = new BookDao();
    }

    public void getBooksInfo() {
        Map<String, List<Book>> daoBooksInfo = bookDao.findBooksInfo();
    }
}
