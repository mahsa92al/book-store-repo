package ir.maktab.service;

import ir.maktab.repository.BookDao;

/**
 * @author Mahsa Alikhani m-58
 */
public class BookService {
    private final BookDao bookDao;

    public BookService() {
        bookDao = new BookDao();
    }

    public void calculateAllBooksSoldTotalPrice() {

    }
}
