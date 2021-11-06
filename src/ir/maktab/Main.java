package ir.maktab;

import ir.maktab.service.BookService;

import java.util.Scanner;

/**
 * @author Mahsa Alikhani m-58
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static BookService bookService;

    public static void main(String[] args) {
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

    private static void viewBooksInfo() {
    }

    private static boolean isNumeric(String choice) {
        return choice.matches("[1-9]+");
    }
}
