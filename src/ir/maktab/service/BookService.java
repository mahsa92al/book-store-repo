package ir.maktab.service;

import ir.maktab.model.Book;
import ir.maktab.repository.BookDao;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Mahsa Alikhani m-58
 */
public class BookService {
    private final BookDao bookDao;

    public BookService() throws SQLException, ClassNotFoundException {
        bookDao = new BookDao();
    }

    public void getBooksInfo() {
    }
}
