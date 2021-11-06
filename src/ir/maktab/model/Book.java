package ir.maktab.model;

/**
 * @author Mahsa Alikhani m-58
 */
public class Book {
    private int id;
    private String authorName;
    private String isbn;
    private String bookTitle;
    private int publishedYear;
    private int price;
    private int soldNumber;
    private long soldTotalPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSoldNumber() {
        return soldNumber;
    }

    public void setSoldNumber(int soldNumber) {
        this.soldNumber = soldNumber;
    }

    public long getSoldTotalPrice() {
        return soldTotalPrice;
    }

    public void setSoldTotalPrice(long soldTotalPrice) {
        this.soldTotalPrice = soldTotalPrice;
    }
}
