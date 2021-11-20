package dziedziczenie;

import java.math.BigDecimal;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book(1,"Spring w Akcji", new Author[] {
                        new Author(1,"Craig","Walls")},
                        new Publisher(1,"Helion"),2020,556,
                        BigDecimal.valueOf(52.66),CoverType.PAPERBACK),
                new Book(2, "Java 8 Edycja", new Author[]{
                        new Author(2, "John","Flegamin")},
                        new Publisher(2, "Oracle"), 2007, 891,
                        BigDecimal.valueOf(54.22),CoverType.HARDCOVER),
                new Book(3, "English is IT", new Author[]{
                        new Author(3, "Alice","Ween")},
                        new Publisher(3, "IT"), 2009, 555,
                        BigDecimal.valueOf(54.22),CoverType.HARDCOVER),
                new Book(4, "Chmura w tle", new Author[]{
                        new Author(4, "Elton","John")},
                        new Publisher(4, "GOOGLE"), 2007, 333,
                        BigDecimal.valueOf(54.22),CoverType.HARDCOVER)};

                BookService bookService = new BookService();

                System.out.println("++++++++++++++++++++++++++++++++++++++++ ");
                System.out.println("HERE ARE ALL CREATED BOOKS: ");
                System.out.println("++++++++++++++++++++++++++++++++++++++++ ");

                for (Book book:books
                     ) {
                    System.out.println(book.toString());
                }
                System.out.println("++++++++++++++++++++++++++++++++++++++++ ");
                System.out.println("HERE ARE FILTERED BOOKS BY AUTHOR:");
                System.out.println("++++++++++++++++++++++++++++++++++++++++ ");

                System.out.println(Arrays.toString(
                              bookService.filterBooksByAuthor(
                                      new Author(1,"Craig","Walls"),books)));

                 System.out.println("++++++++++++++++++++++++++++++++++++++++ ");
                 System.out.println("HERE ARE FILTERED BOOKS BY PUBLISHER:");
                 System.out.println("++++++++++++++++++++++++++++++++++++++++ ");

                System.out.println(Arrays.toString(bookService
                                 .filterBooksByPublisher
                                         (new Publisher(2,"Oracle"),books)));
                System.out.println("++++++++++++++++++++++++++++++++++++++++ ");
                System.out.println("HERE ARE FILTERED BOOKS BY YEARS AFTER SPECIFIED YEAR:");
                System.out.println("++++++++++++++++++++++++++++++++++++++++ ");

                System.out.println(Arrays.toString(bookService
                        .filterBooksAfterSpecifiedYear(2006,books)));

    }
}
