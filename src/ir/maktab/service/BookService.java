package ir.maktab.service;

import ir.maktab.model.Book;
import ir.maktab.repository.BookDao;

import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

/**
 * @author Mahsa Alikhani m-58
 */
public class BookService {
    private final BookDao bookDao;

    public BookService() throws SQLException, ClassNotFoundException {
        bookDao = new BookDao();
    }

    public Map<String, List<Book>> getBooksInfo() throws SQLException {
        List<Book> booksInfo = bookDao.findBooksInfo();
        booksInfo.forEach(i-> i.setSoldTotalPrice(i.getSoldNumber() * i.getPrice()));
        Map<String, List<Book>> sorted = booksInfo.stream()
                .sorted(Comparator.comparing(Book::getAuthorName)
                        .thenComparing(Comparator.comparing(Book::getPublishedYear).reversed()))
                .collect(Collectors.groupingBy(Book::getAuthorName, LinkedHashMap::new, Collectors.toList()));
        return sorted;
    }
}
