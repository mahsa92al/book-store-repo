package ir.maktab;

import ir.maktab.model.Book;
import ir.maktab.service.BookService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Mahsa Alikhani m-58
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static BookService bookService;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        bookService = new BookService();
        int choiceNumber;
        do{
            System.out.println("***Management Menu***");
            System.out.println("1. View books information report\n2. Exit");
            String choice;
            do {
                choice = scanner.next();
            }while (!isNumeric(choice));
            choiceNumber = Integer.parseInt(choice);
            switch (choiceNumber){
                case 1:
                    viewBooksInfo();
                    break;
                case 2:
                    break;
            }
        }while (choiceNumber != 2);
    }

    private static void viewBooksInfo() throws SQLException {
        Map<String, List<Book>> bookMap = bookService.getBooksInfo();
        System.out.printf("%-20s%-10s%-15s%-20s%-15s%-15s%-10s%n", "Author name", "ISBN", "Book title", "Published year"
        ,"Price", "Sold number", "Sold total price");
        System.out.println("+----------------------------------------------------------------------------------------------------------+");
        System.out.println();
        for (Map.Entry<String, List<Book>> entry: bookMap.entrySet()) {
            System.out.println(entry.getKey());
            List<Book> values = entry.getValue();
            values.stream().forEach(i-> System.out.println("\t\t\t\t" + i));
            System.out.println("+----------------------------------------------------------------------------------------------------------+");
        }

    }

    private static boolean isNumeric(String choice) {
        return choice.matches("[1-9]+");
    }
}
